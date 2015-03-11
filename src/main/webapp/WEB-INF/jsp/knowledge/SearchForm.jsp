<%@ include file="../common/IncludeTop.jsp"%>

<div id="Knowledge"><stripes:form
	beanclass="org.mybatis.knowledges.web.actions.KnowledgeActionBean"
	focus="">

	<p>Please enter Knowledge title.</p>
	<p>Title:<stripes:text name="title" value="j2ee" /></p>
	<stripes:submit name="search" value="Search" />

</stripes:form> New Knowledge? <stripes:link
	beanclass="org.mybatis.knowledges.web.actions.KnowledgeActionBean"
	event="newKnowledgeForm">Input Knowledge!</stripes:link></div>

<%@ include file="../common/IncludeBottom.jsp"%>

