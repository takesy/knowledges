package org.mybatis.knowledges.persistence;

import org.mybatis.knowledges.domain.Knowledge;

public interface KnowledgeMapper {

  Knowledge getKnowledgeByTitle(String title);

  void insertKnowledge(Knowledge knowledge);
   
  void updateKnowledge(Knowledge knowledge);

}
