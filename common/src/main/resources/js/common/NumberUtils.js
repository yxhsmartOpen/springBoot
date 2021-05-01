
// 数字工具类
const NumberUtils = {

    /**
     * 验证是否是纯数字
     * @param value
     * @return {boolean}
     */
    num: function (value) {
        const n = /^[0-9]*$/;
        const re = new RegExp(n);
        if (re.test(value)) {
            if (value > 9999999999) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    },
    /**
     * 验证数字是否是指定位数的数字
     * @param value 数值
     * @param num 小数点后的位数
     * @return {boolean}
     */
    validationNumber: function (value, num2) {
        const reg = /^[0-9]+\.?[0-9]*$/;
        if (value != "") {
            if (!reg.test(value)) {
                return false;
            } else {
                if (Number(value) > 9999999999) {
                    return false;
                }
                if (value.indexOf('.') != -1) {
                    if (value.indexOf('.') === value.length - 1) {
                        return false;
                    }
                    if (value.split('.')[1].length > num2) {
                        return false;
                    }
                }
            }
        }
        return true;
    },
    /**
     * 给自定义table的指定行添加背景颜色
     */
    addClassRow: function () {
        const te = $("#currentEffectiveDateStr").val();
        $("#channelsMaintainPriceTable").find('tbody').each(function () {
            $(this).find('tr').each(function () {
                let flag = false;
                // 当某行的td的值等于指定值的时候，将整行背景设置红色，并返回
                $(this).find('td').each(function () {
                    if ($(this).text() === te){
                        flag = true;
                    }
                });
                if (flag){
                    $(this).addClass('odd');
                }
            });
        });
    },
}