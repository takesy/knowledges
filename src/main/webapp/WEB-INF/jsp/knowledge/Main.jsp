<%@ include file="../common/IncludeTop.jsp"%>

<div id="Welcome">
<div id="WelcomeContent"><c:if
	test="${sessionScope.accountBean != null }">
	<c:if test="${sessionScope.accountBean.authenticated}">
        Welcome ${sessionScope.accountBean.account.firstName}!
      </c:if>
</c:if></div>
</div>

<div id="Main">
<div id="Sidebar">
<div id="SidebarContent"><stripes:link
	beanclass="org.mybatis.knowledges.web.actions.KnowledgeActionBean"
	event="viewCategory">
	<stripes:param name="categoryId" value="FISH" />
</stripes:link> <br />
</div>
</div>

<div id="Separator">&nbsp;</div>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>

