
// 日期
const DateUtils = {
    /**
     * 获取当前时间
     * @param one 数字 {如果是 1-31 之间 说明是天数，如果是100 - 120 之间，说明是月份}
     * @return {string|string|*}
     */
    getTimes: function (one) {
        let nowTime = new Date();
        //nowTime.setMinutes(nowTime.getMinutes() + 30)
        nowTime.setMonth(nowTime.getMonth() - 1);
        let year = nowTime.getFullYear(),
            month = nowTime.getMonth() + 1 >= 10 ? nowTime.getMonth() + 1 : '0' + (nowTime.getMonth() + 1),
            day = nowTime.getDate() >= 10 ? nowTime.getDate() : '0' + nowTime.getDate(),
            hours = nowTime.getHours() >= 10 ? nowTime.getHours() : '0' + nowTime.getHours(),
            minute = nowTime.getMinutes() >= 10 ? nowTime.getMinutes() : '0' + nowTime.getMinutes(),
            second = nowTime.getSeconds() >= 10 ? nowTime.getSeconds() : '0' + nowTime.getSeconds(),
            currentTime = "";
        currentTime = year + '-' + month + '-';
        return currentTime;
    },

    /**
     * 检查指定日期字符串是否比上一个月1号的日期小。
     * @param priceEffectiveDateVal
     * @return {boolean} {boolean} true 存在 ， false 不存在
     */
    checkLastMonth: function (priceEffectiveDateVal) {
        // 小于上月1日的数据不让点击"修改、删除"按钮
        let nowTime = new Date();
        nowTime.setMonth(nowTime.getMonth() - 1);
        let year = nowTime.getFullYear(),
            month = nowTime.getMonth() + 1 >= 10 ? nowTime.getMonth() + 1 : '0' + (nowTime.getMonth() + 1);
        let lastMonth = year + '-' + month + '-' + '01';
        lastMonth = lastMonth.replaceAll("-", "");
        let date1 = priceEffectiveDateVal.replaceAll("-", "");
        return Number(date1) < Number(lastMonth);

    },
    /**
     * 获取当前月第一天日期字符串
     * @return String 当前日期字符串
     */
    getCurrentMonth: function () {
        let nowTime = new Date();
        nowTime.setMonth(nowTime.getMonth());
        let year = nowTime.getFullYear(),
            month = nowTime.getMonth() + 1 >= 10 ? nowTime.getMonth() + 1 : '0' + (nowTime.getMonth() + 1);
        return year + '-' + month + '-' + '01';
    },
    /**
     * 获取下个月第一天日期
     * @return  String 下个月第一天日期字符串
     */
    getNextMonth: function () {
        let nowTime = new Date();
        nowTime.setMonth(nowTime.getMonth() + 1);
        let year = nowTime.getFullYear(),
            month = nowTime.getMonth() + 1 >= 10 ? nowTime.getMonth() + 1 : '0' + (nowTime.getMonth() + 1);
        return year + '-' + month + '-' + '01';
    },
    /**
     * 单选框：全选、反选
     * 注意：一般来说，我们都是点击题头的复选框，列表的复选框全选或者全不选。所以人为地规定题头复选框的name值和列表复选框的属性值，差别一个id。
     * @param obj 当前对象
     * @param name 点击复选框的name属性值
     */
    selectAll: function (obj, name) {
        const checked = $(obj).prop('checked');
        if (checked) {
            $('input[name=' + name + 'Id]').each(function () {
                $(this).prop('checked', true);
            })
        } else {
            $('input[name=' + name + 'Id]').each(function () {
                $(this).prop('checked', false);
            })
        }
    }
};
