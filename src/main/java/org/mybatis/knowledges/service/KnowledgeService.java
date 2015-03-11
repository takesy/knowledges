package org.mybatis.knowledges.service;

import org.mybatis.knowledges.domain.Knowledge;
import org.mybatis.knowledges.persistence.KnowledgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KnowledgeService {

  @Autowired
  private KnowledgeMapper knowledgeMapper;

  public Knowledge getKnowledge(String title) {
    return knowledgeMapper.getKnowledgeByTitle(title);
  }

  @Transactional
  public void insertKnowledge(Knowledge knowledge) {
	knowledgeMapper.insertKnowledge(knowledge);
  }

  @Transactional
  public void updateKnowledge(Knowledge knowledge) {
    knowledgeMapper.updateKnowledge(knowledge);
  }

}
