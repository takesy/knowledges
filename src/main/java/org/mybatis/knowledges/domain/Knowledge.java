package org.mybatis.knowledges.domain;

import java.io.Serializable;

public class Knowledge implements Serializable {

  private static final long serialVersionUID = 1L;

  private String title;
  private String sort;
  private String knowledge;
  private String comment;
  
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSort() {
	return sort;
}
public void setSort(String sort) {
	this.sort = sort;
}
public String getKnowledge() {
	return knowledge;
}
public void setKnowledge(String knowledge) {
	this.knowledge = knowledge;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

}
