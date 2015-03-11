<%@ include file="../common/IncludeTop.jsp"%>

<div id="Knowledge"><stripes:form
	beanclass="org.mybatis.knowledges.web.actions.KnowledgeActionBean"
	focus="">

	<h3>Knowledge Information</h3>

	<table>
		<tr>
			<td>Title:</td>
			<td>${actionBean.title}</td>
		</tr>
		<tr>
			<td>Sort:</td>
			<td>${actionBean.sort}</td>
		</tr>
		<tr>
			<td>Summary:</td>
			<td>${actionBean.summary}</td>
		</tr>
		<tr>
			<td>Knowledge:</td>
			<td>${actionBean.knowledge}</td>
		</tr>
		<tr>
			<td>Comment:</td>
			<td>${actionBean.comment}</td>
		</tr>
	</table>

	<stripes:submit name="newKnowledge" value="Save Knowledge Information" />

</stripes:form></div>

<%@ include file="../common/IncludeBottom.jsp"%>