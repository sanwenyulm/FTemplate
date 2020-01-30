(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-71b55109"],{"459b":function(e,t,n){},"58fe":function(e,t,n){"use strict";var r=n("459b"),s=n.n(r);s.a},e382:function(e,t,n){"use strict";n.r(t);var r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"app-container"},[n("el-button",{attrs:{type:"primary"},on:{click:e.handleAddDevice}},[e._v("\n    添加用户\n  ")]),e._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:e.handleRefresh}},[e._v("\n    刷新\n  ")]),e._v(" "),n("el-table",{staticStyle:{width:"100%","margin-top":"30px"},attrs:{data:e.userList,border:""}},[n("el-table-column",{attrs:{align:"center",label:"用户名",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n        "+e._s(t.row.name)+"\n      ")]}}])}),e._v(" "),n("el-table-column",{attrs:{align:"header-center",label:"状态"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n        "+e._s(1==t.row.loginState?"在线":"离线")+"\n      ")]}}])}),e._v(" "),n("el-table-column",{attrs:{align:"header-center",label:"联系方式"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n        "+e._s(t.row.phone)+"\n      ")]}}])}),e._v(" "),n("el-table-column",{attrs:{align:"header-center",label:"公司"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n        "+e._s(t.row.compnay)+"\n      ")]}}])}),e._v(" "),n("el-table-column",{attrs:{align:"header-center",label:"上次登陆"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v("\n          "+e._s(t.row.lastlogintime)+"\n        ")]}}])}),e._v(" "),n("el-table-column",{attrs:{align:"center",label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[n("el-button",{attrs:{type:"primary",size:"small"},on:{click:function(n){return e.handleEdit(t)}}},[e._v("\n          编辑\n        ")]),e._v(" "),n("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(n){return e.handleDelete(t)}}},[e._v("\n          删除\n        ")])]}}])})],1),e._v(" "),n("el-dialog",{attrs:{visible:e.dialogVisible,title:"edit"===e.dialogType?"编辑用户":"新建用户"},on:{"update:visible":function(t){e.dialogVisible=t}}},[n("el-form",{attrs:{model:e.user,"label-width":"80px","label-position":"left"}},[n("el-form-item",{attrs:{label:"用户名"}},[n("el-input",{attrs:{placeholder:"用户名"},model:{value:e.user.name,callback:function(t){e.$set(e.user,"name",t)},expression:"user.name"}})],1),e._v(" "),n("el-form-item",{attrs:{label:"联系方式"}},[n("el-input",{attrs:{placeholder:"联系方式"},model:{value:e.user.phone,callback:function(t){e.$set(e.user,"phone",t)},expression:"user.phone"}})],1),e._v(" "),n("el-form-item",{attrs:{label:"公司"}},[n("el-input",{attrs:{placeholder:"公司"},model:{value:e.user.compnay,callback:function(t){e.$set(e.user,"compnay",t)},expression:"user.compnay"}})],1),e._v(" "),n("el-form-item",{attrs:{label:"IMEI"}},[n("el-input",{attrs:{placeholder:"手机设备号"},model:{value:e.user.imei,callback:function(t){e.$set(e.user,"imei",t)},expression:"user.imei"}})],1)],1),e._v(" "),n("div",{staticStyle:{"text-align":"right"}},[n("el-button",{attrs:{type:"danger"},on:{click:function(t){e.dialogVisible=!1}}},[e._v("\n        "+e._s(e.$t("permission.cancel"))+"\n      ")]),e._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:e.confirmRole}},[e._v("\n        "+e._s(e.$t("permission.confirm"))+"\n      ")])],1)],1)],1)},s=[],i=n("cebc"),a=(n("96cf"),n("3b8d")),l=n("bd86"),c=n("df7c"),o=n.n(c),u=(n("ed08"),n("c24f")),d={key:"",name:"",description:"",routes:[]},h={data:function(){var e;return{switchStatus:!1,user:(e={userid:1,id:0,name:1,phone:""},Object(l["a"])(e,"name",""),Object(l["a"])(e,"compnay",""),Object(l["a"])(e,"lastlogintime",""),Object(l["a"])(e,"imei",""),Object(l["a"])(e,"cardid",""),Object(l["a"])(e,"loginState",""),e),routes:[],userList:[],dialogVisible:!1,dialogType:"new",checkStrictly:!1,defaultProps:{children:"children",label:"title"}}},computed:{routesData:function(){return this.routes}},created:function(){this.getUsers()},methods:{handleRefresh:function(){this.getUsers()},getUsers:function(){var e=Object(a["a"])(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,Object(u["d"])(1,0);case 2:t=e.sent,this.userList=t;case 4:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),handleAddDevice:function(){this.role=Object.assign({},d),this.$refs.tree&&this.$refs.tree.setCheckedNodes([]),this.dialogType="new",this.dialogVisible=!0},handleEdit:function(e){var t=this;this.dialogType="edit",this.dialogVisible=!0,this.checkStrictly=!0,this.user=e.row,this.$nextTick(function(){var e=t.generateRoutes(t.role.routes);t.$refs.tree.setCheckedNodes(t.generateArr(e)),t.checkStrictly=!1})},handleDelete:function(e){var t=this,n=e.$index,r=e.row;this.$confirm("要删除此用户?","Warning",{confirmButtonText:"删除",cancelButtonText:"取消",type:"warning"}).then(Object(a["a"])(regeneratorRuntime.mark(function e(){var s;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,Object(u["b"])(r.id);case 2:s=e.sent,s?(t.userList.splice(n,1),t.$message({type:"success",message:"删除成功!"})):t.$message({type:"success",message:"删除失败!"});case 4:case"end":return e.stop()}},e)}))).catch(function(e){console.error(e)})},confirmRole:function(){var e=Object(a["a"])(regeneratorRuntime.mark(function e(){var t,n,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:if(t="edit"===this.dialogType,!t){e.next=8;break}return e.next=4,Object(u["g"])(this.user);case 4:n=e.sent,n?this.$message({type:"success",message:"更新成功!"}):this.$message({type:"success",message:"更新失败!"}),e.next=13;break;case 8:return e.next=10,Object(u["a"])(this.user);case 10:r=e.sent,this.user.id=r,this.userList.push(this.user);case 13:this.dialogVisible=!1;case 14:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),onlyOneShowingChild:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:[],t=arguments.length>1?arguments[1]:void 0,n=null,r=e.filter(function(e){return!e.hidden});return 1===r.length?(n=r[0],n.path=o.a.resolve(t.path,n.path),n):0===r.length&&(n=Object(i["a"])({},t,{path:"",noShowingChildren:!0}),n)}}},p=h,f=(n("58fe"),n("2877")),m=Object(f["a"])(p,r,s,!1,null,"24b05ead",null);t["default"]=m.exports}}]);