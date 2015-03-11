package org.mybatis.knowledges.web.actions;

import javax.servlet.http.HttpSession;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.Validate;

import org.mybatis.knowledges.domain.Knowledge;
import org.mybatis.knowledges.service.KnowledgeService;

@SessionScope
public class KnowledgeActionBean extends AbstractActionBean {

  private static final long serialVersionUID = 1L;

  private static final String NEW_KNOWLEDGE = "/WEB-INF/jsp/knowledge/NewKnowledgeForm.jsp";
  private static final String EDIT_KNOWLEDGE = "/WEB-INF/jsp/knowledge/EditKnowledgeForm.jsp";
  private static final String SEARCH = "/WEB-INF/jsp/knowledge/SerchForm.jsp";
  
  @SpringBean
  private transient KnowledgeService knowledgeService;

  private Knowledge knowledge = new Knowledge();

  public Knowledge getKnowledge() {
    return this.knowledge;
  }

  public String getTitle() {
    return knowledge.getTitle();
  }
  
  @Validate(required=true, on={"newKnowledge", "editKnowledge"})
  public void setTitle(String title) {
	  knowledge.setTitle(title);
  }

  public String getSort() {
    return knowledge.getSort();
  }

  @Validate(required=true, on={"newKnowledge", "editKnowledge"})
  public void setSort(String sort) {
	  knowledge.setSort(sort);
  }

  public Resolution newKnowledgeForm() {
    return new ForwardResolution(NEW_KNOWLEDGE);
  }
  
  public Resolution newKnowledge() {
	knowledgeService.insertKnowledge(knowledge);
	knowledge = knowledgeService.getKnowledge(knowledge.getTitle());
    return new RedirectResolution(SEARCH);
  }

  public Resolution editKnowledgeForm() {
    return new ForwardResolution(EDIT_KNOWLEDGE);
  }

  public Resolution editKnowledge() {
	knowledgeService.updateKnowledge(knowledge);
	knowledge = knowledgeService.getKnowledge(knowledge.getTitle());
    return new RedirectResolution(SEARCH);
  }
  
  @DefaultHandler
  public Resolution searchForm() {
    return new ForwardResolution(SEARCH);
  }

  public Resolution search() {

	  knowledge = knowledgeService.getKnowledge(knowledge.getTitle());
   
    if (knowledge == null) {
      String value = "Invalid title.  Search failed.";
      setMessage(value);
      clear();
      return new ForwardResolution(SEARCH);
    } else {
      HttpSession s = context.getRequest().getSession();
      s.setAttribute("knowledgeBean", this);
      return new RedirectResolution(EDIT_KNOWLEDGE);
    }
  }

  public Resolution exit() {
    context.getRequest().getSession().invalidate();
    clear();
    return new RedirectResolution(SEARCH);
  }

  public void clear() {
	  knowledge = new Knowledge();
  }

}
