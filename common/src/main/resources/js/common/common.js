/*******************************************************************************
 * 共公js方法
 */
const DCMP = {
    /**
     * 禁止保存按钮
     *
     * @param id
     */
    stopBtn: function (id) {
        var id = '#' + id;
        $(id).removeClass("btn-default");
        $(id).addClass("disabled");
        $(id).attr("disabled", "disabled");
    },
    /**
     * 启用保存按钮
     *
     * @param id
     */
    startBtn: function (id) {
        var id = '#' + id;
        $(id).removeClass("disabled");
        $(id).removeAttr("disabled");
        $(id).addClass("btn-default");
    },
    /**
     * 获取所选的数据信息
     *
     * @returns {String}
     */
    getSelectionsIds: function () {
		let ids = "";
        jQuery("input[name=checkItem]").each(function () {
            //console.log(this)
            if ($(this).prop("checked") == true) {
				let id = $(this).val();
                if (ids != "") {
                    ids += ",";
                }
                ids += id;
            }

        });
        return ids;
    },
    /**
     * checkbox获取所选的数据
     *
     * @returns {String}
     */
    getCheckedValue: function (nameObj) {
		let ids = "";
		let idName = "input[name=" + nameObj + "]";
        jQuery(idName).each(function () {
            if ($(this).prop("checked") == true) {
				let id = $(this).val();
                if (ids != "") {
                    ids += ",";
                }
                ids += id;
            }

        });
        return ids;
    },
    /**
     * 判断为空
     *
     * @param value
     * @returns {Boolean}
     */
    isNull: function (value) {
        value = jQuery.trim(value);// 去除两头空格
        if (value == undefined || value == null || value == '') {
            return true;
        } else {
            return false;
        }
    },
    /**
     * 判断为非负整数（正整数 + 0）
     *
     * @param value
     * @returns {Boolean}
     */
    isNumber: function (value) {
        if ((/^\d*$/.test(value))) {
            return true;
        } else {
            return false;
        }
    },
    /**
     * 字母、数字、或者下划线
     *
     * @param value
     * @returns {Boolean}
     */
    isCharOrNumber: function (value) {
        if ((/^\w+$/.test(value))) {
            return true;
        } else {
            return false;
        }
    },
    /**
     * 返回空''
     *
     * @param value
     * @returns {String}
     */
    getNullValue: function (value) {
        if (value == undefined || value == null || value == '' || value == 'null') {
            value = '';
        }
        return value;
    },
    /**
     * 0返回''
     *
     * @param value
     * @param isTrue
     * @returns
     */
    zeroToNull: function (value, isTrue) {
        if (value == '0' && isTrue != 'true') {
            return '';
        } else {
            return value;
        }
    },
    /**
     * 判断不为空
     *
     * @param value
     * @returns {Boolean}
     */
    isNotNull: function (value) {
        if (DCMP.isNull(value)) {
            return false;
        } else {
            return true;
        }
    },
    /**
     * 判断是否包含中文
     *
     * @param value
     * @returns {Boolean}
     */
    hasChinese: function (value) {
		let reg = new RegExp("[\\u4E00-\\u9FFF]+", "g");
        if (reg.test(value))
            return true;
        else
            return false;
    },
    /**
     * 验证ip
     *
     * @param ip
     * @returns {Boolean}
     */
    isipv4: function (ip) {
        if (ip == "" || ip == null) {
            return false;
        }
        let ipRegex = /^(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)$/;
        if (!(ipRegex.test(ip))) {
            return false;
        } else {
            return true;
        }
    },
    /**
     * 1~9位数字,小数最多有四位。
     *
     * @param money
     * @returns {Boolean}
     */
    checkMoney: function (money) {
        if (money == "" || money == null) {
            return false;
        }
        let moneyRegex = /^[\-]?(([1-9]\d{0,8})|0)(\.\d{1,4})?$/;
        if (!(moneyRegex.test(money))) {
            return false;
        } else {
            return true;
        }
    },
    /**
     * 验证ip数据组
     *
     * @param str
     * @returns {Boolean}
     */
    isIp4Array: function (str) {
        if (str.length < 1) {
            return false;
        }
		let ospUserArray = []; // 定义一数组
        ospUserArray = str.split(","); // 字符分割
        if (ospUserArray.length > 0) {
            for (let i = 0; i < ospUserArray.length; i++) {
                if (!DCMP.isipv4(ospUserArray[i])) {
                    alert("请输入正确的ip地址!");
                    return false;
                }
                // 判断重复
                if (DCMP.isAgain(str, ospUserArray[i])) {
                    alert("IP重复，请重新输入!");
                    return false;
                }
            } // end for
        }
        return true;
    },
    /**
     * 判断重复
     *
     * @param userArray
     * @param strUser
     * @returns {Boolean}
     */
    isAgain: function (userArray, strUser) {
        if (userArray.length < 1 || strUser.length < 1) {
            return false;
        }
		let ospUserArray = []; // 定义一数组
        ospUserArray = userArray.split(","); // 字符分割
		let userFlag = 0;
		for (let i = 0; i < ospUserArray.length; i++) {
            if (strUser == ospUserArray[i]) {
                userFlag++;
            }
        } // end for
        if (userFlag >= 2) {
            return true;
        }
    },
    S4: function () {
        return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
    },
    /**
     * 生成一个用不重复的ID var myID = "static" + DCMP.guid();
     *
     * @returns
     */
    guid: function () {
        return (DCMP.S4() + DCMP.S4() + "-" + DCMP.S4() + "-" + DCMP.S4() + "-" + DCMP.S4() + "-" + DCMP.S4() + DCMP.S4() + DCMP.S4());
    },
    /**
     * 验证手机号码
     *
     * @param mobile
     * @returns {Boolean}
     */
    mobile: function (mobile) {
        if (mobile == "" || mobile == null) {
            return false;
        }
		let regex = /^1[3456789]\d{9}$/;
        if (!(regex.test(mobile))) {
            return false;
        } else {
            return true;
        }
    },
    /**
     * 判断是否是日期 yyyy-mm-dd
     */
    isDate: function (str) {
		let result = str.match(/^(\d{4})(-)(\d{2})(-)(\d{2})$/);
        if (result == null)
            return false;
		let d = new Date(result[1], result[3] - 1, result[5]);
        return (d.getFullYear() == result[1] && d.getMonth() + 1 == result[3] && d.getDate() == result[5]);
    },
    /***************************************************************************
     * 显示隐藏 查询框 type 0 显示 1 隐藏
     */
    showSearchTable: function (id, type) {
        if (type == 1) {
            $("#" + id).hide();
        } else {
            $("#" + id).show();
        }
    },
    /**
     * 隐藏查询框
     */
    hideSearchTable: function () {
		let hideSearchShow = $("#hideSearchShow").val();
        DCMP.showSearchTable("hideSearch", hideSearchShow);
        if (hideSearchShow == '0') {
            $("#hideSearchShow").val('1');
            $(".expand").text("隐藏查询");
            $(".expand").removeClass("expand").addClass("hide_search");
        } else {
            $("#hideSearchShow").val('0');
            $(".hide_search").text("展开查询");
            $(".hide_search").removeClass("hide_search").addClass("expand");
        }
    },
    /**
     * 判断checkbox中否选中
     */
    isCheckBoxed: function (objName) {
		let obj = "input[name=" + objName + "]";
		let ids = "";
        jQuery(obj).each(function () {
            if ($(this).prop("checked") == true) {
				let id = $(this).val();
                if (ids != "") {
                    ids += ",";
                }
                ids += id;
            }

        });
        if (DCMP.isNotNull(ids)) {
            return true;
        } else {
            return false;
        }
    },
    /**
     * @param string
     * @param num
     *            长度
     * @returns 截取过长字符串
     */
    subLimit: function (string, num) {
        if (string == undefined || string == null || string == '') {
            return string;
        }
		let objLength = string.length;

        if (objLength > num) {
            string = string.substring(0, num) + "...";
        }
        return string;
    },
    /**
     * 删除数据
     *
     * @param str
     *            1,3,5,9
     * @param delStr
     *            3,5
     * @returns {String} 1,9
     */
    delArray: function (str, delStr) {
		let strArray = []; // 定义一数组
        strArray = str.split(","); // 字符分割
		let returnStr = "";
        for (let i = 0; i < strArray.length; i++) {
			let falg = false;
			let delArray = delStr.split(",");
            for (let j = 0; j < delArray.length; j++) {
                if (strArray[i] == delArray[j]) {
                    falg = true;
                }
            }
            if (!falg) {
                if (returnStr != "") {
                    returnStr += ",";
                }
                returnStr += strArray[i];
            }
        } // end for
        return returnStr;
    },
    /**
     * 排序
     * @param type
     */
    initSort: function (type) {
        table.on('sort(' + type + 'Filter)', function (obj) { // 注：tool是工具条事件名，test是table原始容器的属性
            // lay-filter="对应的值"
			let json = {};
            $("." + type).each(function () {
                json[$(this).attr("name")] = $(this).val();
            })
            json["field"] = obj.field;
            json["order"] = obj.type;
            table.reload(type + 'Table', {
                method: 'post',
                where: json,
                page: {
                    curr: 1
                }
            });
			let newObj = $('.layui-unselect[data-field="' + obj.field + '"]').find(".layui-table-sort-" + obj.type);
            if (obj.type == "asc") {
                $(newObj).css("border-bottom-color", "#000");
            } else {
                $(newObj).css("border-top-color", "#000");
            }
        });
    },
    // 全选
    selectAll: function (obj, check) {
		let checked = $("input[name='" + obj + "']").prop('checked');
		let ids = "input[name=check_" + check + "]";
        if (checked) {
            $(ids).each(function () {
                $(this).prop('checked', true);
            })
        } else {
            $(ids).each(function () {
                $(this).prop('checked', false);
            })
        }
    }


};
