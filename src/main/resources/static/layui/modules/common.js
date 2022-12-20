layui.define(['jquery'], function(exports){ 

    var $ = layui.jquery;

    var obj = {

        ajax: function (url, type, dataType, data, callback) {

            $.ajax({

                url: url,

                type: type,

                dataType: dataType,

                data: data,

                success: callback

            });

        }

    };

    //expotts("key",value)
    //key你懂吧？  待会在第二步就要用key值来获取var table这个对象。继而调用对象中函数
    exports('common', obj);

});