//ajax paging
var pageCount=1;
var totalPageCount=1;
$(function(){
	setOrders();
});
function setOrders(){
	$.ajax({
		url:'ToOrder?action=userOrder&pageCount='+pageCount,
		type:'get',
		dataType:'json',
		success:function(data){
			$('#orders').html('');
			$('#orders').append('<tr><td width="20%">订单号</td><td width="25%">下单时间</td><td width="15%">订单总金额</td><td width="25%">订单状态</td><td width="15%">操作</td></tr>');
			var type=$('#type').val();
			if(type==1){
				$.each(data,function(i){
					var status="";
					switch(data[i].status){
					case 0:
						status="待付款";break;
					case 1:
						status="发货中";break;
					case 2:
						status="待收货";break;
					case 3:
						status="已收货";break;
					}
					$('#orders').append('<tr><td><font color="#ff4e00">'+
							data[i].orderNum+
							'</font></td><td>'+
							data[i].createTime+
							'</td><td>￥'+data[i].cost+
							'</td><td>'+status+
							'</td><td></td></tr>');
				});
			}else if(type==0){
				$.each(data,function(i){
					var status="";
					switch(data[i].status){
					case 0:
						status="待付款";break;
					case 1:
						status="发货中";break;
					case 2:
						status="待收货";break;
					case 3:
						status="已收货";break;
					}
					$('#orders').append('<tr><td><font color="#ff4e00">'+
							data[i].orderNum+
							'</font></td><td>'+
							data[i].createTime+
							'</td><td>￥'+data[i].cost+
							'</td><td>'+status+
							'</td><td>'+
//							address cost
							'<a>修改</a>&nbsp;&nbsp;&nbsp;'+
							'<a href="ToOrder?action=delete">删除</a>'+
							'</td></tr>');
				});
			}
			paging();
		},
		error:function(){
//			not login?
//			alert('memberorder ajax!');
		}
	});
};
function paging(){
	$.ajax({
		url:'ToOrder?action=orderPage&pageCount='+pageCount,
		type:'get',
		dataType:'text',
		success:function(data){
			var temp=data.split(",");
			pageCount=temp[0];
			totalPageCount=temp[1];
			if(totalPageCount==1){
				
			}else if(totalPageCount<=10){
				var eachPage='';
				for(var i=1;i<=totalPageCount;i++){
					if(pageCount==i){
						eachPage+='<a onclick="toOrder(jq(this))" style="color:#ff4e00;">   '+i+'</a><input type="hidden" value="'+i+'"/>';
					}else{
						eachPage+='<a onclick="toOrder(jq(this))">   '+i+'</a><input type="hidden" value="'+i+'"/>';
					}
					
				}
				$('#orders').append('<tr><td colspan="5">'+
						'<a onclick="toOrder(jq(this))">首页</a><input type="hidden" value="1"/>'+
						'<a onclick="toOrder(jq(this))">   上一页</a><input type="hidden" value="-"/>'+eachPage+
						'<a onclick="toOrder(jq(this))">   下一页</a><input type="hidden" value="+"/>'+
						'<a onclick="toOrder(jq(this))">   尾页</a><input type="hidden" value="'+totalPageCount+'"/>'+
						'</td></tr>');
			}
		},
		error:function(){
//			not login?
//			alert('memberorder ajax!');
		}
	});
};
function toOrder(doc){
	var temp=doc.next().val();
//	pageCount=$("#pageCount").val();
//	totalPageCount=$("#totalPageCount").val();
	if(temp=="-"){
		if(pageCount>1){
			pageCount=Number(pageCount)-1;
		}
	}else if(temp=="+"){
		if(pageCount<totalPageCount){
			pageCount=Number(pageCount)+1;
		}
	}else{
		pageCount=temp;
	}
	setOrders();
}


