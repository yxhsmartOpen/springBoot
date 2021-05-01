<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>调价邮件通知</title>
</head>
<body>
<input type="hidden" id="type" value="notice">
<div style="min-width: 1200px;">

    <div class="content">
        <!-- Start Page Header -->
        <div class="page-header">
            <input type="hidden" id="module_fid" value="6">
            <input type="hidden" id="module_id" value="126">
            <h1 class="title" style="float:left">调价邮件通知</h1>
            <ol class="breadcrumb" style="float: left; padding: 6px 0 0 20px">
                <li><a href="${ctx}/index.html">首页</a></li>
                <li>通道管理</li>
                <li><a href="${ctx}/channelsMaintain/channelsMaintainListUI.html">子平台通道信息维护列表</a></li>
                <li class="active">调价邮件通知</li>
            </ol>
            <div class="clear"></div>
        </div>
        <!-- End Page Header -->
        <!--客户信息列表-->
        <div class="container-padding">

            <!-- Start Row -->
            <div class="row">
                <h3 align="center"><strong>通道成本单价变动通知</strong></h3>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;将邮件通知以下通道价格变动：
                <!-- Start Panel -->
                <div class="col-md-12">
                    <div class="panel panel-default ">
                        <input type="hidden" name="maintainIds" id="maintainIds" value="${ids}"/>
                        <!-- 分页 -->
                        <table width="100%" border="0" cellspacing="0" cellpadding="0" class="list_content layui-table">
                            <tbody>
                                <tr class="table_bt">
                                    <td align="center">通道代码</td>
                                    <td align="center">账号</td>
                                    <td align="center">通道名称</td>
                                    <td align="center" width="30%">调价前</td>
                                    <td align="center" width="30%">调价后</td>
                                    <td align="center">调价生效日期</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="new_user04 obj">
                        <span class="title" style="padding-top:8px;">请勾选收件人：</span>
                        <div class="checkbox left" style="padding-top:8px; width:120px;">
                            <input name="address" id="address" value="0" type="checkbox" onclick="DateUtils.selectAll(this,'address')">
                            <label for="address" >全/反</label>
                        </div>
                    </div>
                    <div class="new_user04 obj">
                        <div class="left" style="padding-top:8px; width:100px;">
                            <label></label>
                        </div>
                        <c:forEach items="${emailList1}" var="s5" varStatus="emailListStatus1" >
                            <c:choose>
                                <c:when  test="${s5.paraName != null && s5.paraName != '' && s5.orderno == 1 }">
                                    <div class="checkbox left" style="padding-top:8px; width:150px;">
                                        <input type="checkbox" id="address${emailListStatus1.index}" name="addressId" value="${s5.paraValue}" checked>
                                        <label for="address${emailListStatus1.index}">${s5.paraName}</label>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="checkbox left" style="padding-top:8px; width:150px;">
                                        <input type="checkbox" id="address${emailListStatus1.index}" name="addressId" value="${s5.paraValue}">
                                        <label for="address${emailListStatus1.index}">${s5.paraName}</label>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </div>
                    <c:if test="${emailList2 != null || fn:length(emailList2) != 0}">
                    </br>
                        <div class="new_user04 obj">
                            <div class="left" style="padding-top:8px; width:100px;">
                                <label></label>
                            </div>
                            <c:forEach items="${emailList2}" var="s6" varStatus="emailListStatus2" >
                                <c:choose>
                                    <c:when  test="${s6.paraName != null && s6.paraName != '' && s6.orderno == 1 }">
                                        <div class="checkbox left" style="padding-top:8px; width:150px;">
                                            <input type="checkbox" id="address2${emailListStatus2.index}" name="addressId" value="${s6.paraValue}" checked>
                                            <label for="address2${emailListStatus2.index}">${s6.paraName}</label>
                                        </div>
                                    </c:when>
                                    <c:otherwise>
                                        <div class="checkbox left" style="padding-top:8px; width:150px;">
                                            <input type="checkbox" id="address2${emailListStatus2.index}" name="addressId" value="${s6.paraValue}">
                                            <label for="address2${emailListStatus2.index}">${s6.paraName}</label>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </div>
                    </c:if>
                    <div class="new_user04 obj">
                        <span class="title" style="padding-top:8px;">请勾选抄送人：</span>
                        <div class="checkbox left" style="padding-top:8px; width:120px;">
                            <input name="secondaryAddress" id="secondaryAddress" value="0" type="checkbox" onclick="DateUtils.selectAll(this,'secondaryAddress')">
                            <label for="secondaryAddress" >全/反</label>
                        </div>
                    </div>
                    <div class="new_user04 obj">
                        <div class="left" style="padding-top:8px; width:100px;">
                            <label></label>
                        </div>
                        <c:forEach items="${emailList1}" var="s7" varStatus="emailListStatus3" >
                            <c:choose>
                                <c:when  test="${s7.paraName != null && s7.paraName != '' && s7.orderno == 2 }">
                                    <div class="checkbox left" style="padding-top:8px; width:150px;">
                                        <input type="checkbox" id="secondaryAddress${emailListStatus3.index}" name="secondaryAddressId" value="${s7.paraValue}" checked>
                                        <label for="secondaryAddress${emailListStatus3.index}">${s7.paraName}</label>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="checkbox left" style="padding-top:8px; width:150px;">
                                        <input type="checkbox" id="secondaryAddress${emailListStatus3.index}" name="secondaryAddressId" value="${s7.paraValue}">
                                        <label for="secondaryAddress${emailListStatus3.index}">${s7.paraName}</label>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </div>
                    <c:if test="${emailList2 != null || fn:length(emailList2) != 0}">
                        </br>
                        <div class="new_user04 obj">
                            <div class="left" style="padding-top:8px; width:100px;">
                                <label></label>
                            </div>
                            <c:forEach items="${emailList2}" var="s8" varStatus="emailListStatus4" >
                                <c:choose>
                                    <c:when  test="${s8.paraName != null && s8.paraName != '' && s8.orderno == 2 }">
                                        <div class="checkbox left" style="padding-top:8px; width:150px;">
                                            <input type="checkbox" id="secondaryAddress2${emailListStatus4.index}" name="secondaryAddressId" value="${s8.paraValue}" checked>
                                            <label for="secondaryAddress2${emailListStatus4.index}">${s8.paraName}</label>
                                        </div>
                                    </c:when>
                                    <c:otherwise>
                                        <div class="checkbox left" style="padding-top:8px; width:150px;">
                                            <input type="checkbox" id="secondaryAddress2${emailListStatus4.index}" name="secondaryAddressId" value="${s8.paraValue}">
                                            <label for="secondaryAddress2${emailListStatus4.index}">${s8.paraName}</label>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </div>
                    </c:if>
                    <div class="modal-footer left">
                        <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <button type="button" class="btn btn-default" name="save" id="mailSend">邮件发送</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="button" class="btn btn-white" data-dismiss="modal" name="back" id="back">取消</button>
                    </div>
                </div>
                <!-- End Panel -->
            </div>
            <!-- End Row -->
        </div>

        <!-- End Footer -->
    </div>
</div>
<script src="${ctx}/js/common/dateUtils.js?v=<%=Math.random()%>"></script>
<script src="${ctx}/js/jquery.min.js?v=<%=Math.random()%>"></script>
</body>
</html>