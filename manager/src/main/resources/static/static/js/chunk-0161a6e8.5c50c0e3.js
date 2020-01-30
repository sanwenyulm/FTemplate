(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-0161a6e8"],{9963:function(e,s,i){},a99f:function(e,s,i){"use strict";i.r(s);var t=function(){var e=this,s=e.$createElement,i=e._self._c||s;return i("div",{staticClass:"app-container"},[i("switch-roles",{on:{change:e.handleRolesChange}}),e._v(" "),i("div",{key:e.key,staticStyle:{"margin-top":"30px"}},[i("div",[i("span",{directives:[{name:"permission",rawName:"v-permission",value:["admin"],expression:"['admin']"}],staticClass:"permission-alert"},[e._v("\n        Only\n        "),i("el-tag",{staticClass:"permission-tag",attrs:{size:"small"}},[e._v("admin")]),e._v(" can see this\n      ")],1),e._v(" "),i("el-tag",{directives:[{name:"permission",rawName:"v-permission",value:["admin"],expression:"['admin']"}],staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n        v-permission=\"['admin']\"\n      ")])],1),e._v(" "),i("div",[i("span",{directives:[{name:"permission",rawName:"v-permission",value:["editor"],expression:"['editor']"}],staticClass:"permission-alert"},[e._v("\n        Only\n        "),i("el-tag",{staticClass:"permission-tag",attrs:{size:"small"}},[e._v("editor")]),e._v(" can see this\n      ")],1),e._v(" "),i("el-tag",{directives:[{name:"permission",rawName:"v-permission",value:["editor"],expression:"['editor']"}],staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n        v-permission=\"['editor']\"\n      ")])],1),e._v(" "),i("div",[i("span",{directives:[{name:"permission",rawName:"v-permission",value:["admin","editor"],expression:"['admin','editor']"}],staticClass:"permission-alert"},[e._v("\n        Both\n        "),i("el-tag",{staticClass:"permission-tag",attrs:{size:"small"}},[e._v("admin")]),e._v(" and\n        "),i("el-tag",{staticClass:"permission-tag",attrs:{size:"small"}},[e._v("editor")]),e._v(" can see this\n      ")],1),e._v(" "),i("el-tag",{directives:[{name:"permission",rawName:"v-permission",value:["admin","editor"],expression:"['admin','editor']"}],staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n        v-permission=\"['admin','editor']\"\n      ")])],1)]),e._v(" "),i("div",{key:"checkPermission"+e.key,staticStyle:{"margin-top":"60px"}},[i("aside",[e._v("\n      "+e._s(e.$t("permission.tips"))+"\n      "),i("br"),e._v(" e.g.\n    ")]),e._v(" "),i("el-tabs",{staticStyle:{width:"550px"},attrs:{type:"border-card"}},[e.checkPermission(["admin"])?i("el-tab-pane",{attrs:{label:"Admin"}},[e._v("\n        Admin can see this\n        "),i("el-tag",{staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n          v-if=\"checkPermission(['admin'])\"\n        ")])],1):e._e(),e._v(" "),e.checkPermission(["editor"])?i("el-tab-pane",{attrs:{label:"Editor"}},[e._v("\n        Editor can see this\n        "),i("el-tag",{staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n          v-if=\"checkPermission(['editor'])\"\n        ")])],1):e._e(),e._v(" "),e.checkPermission(["admin","editor"])?i("el-tab-pane",{attrs:{label:"Admin-OR-Editor"}},[e._v("\n        Both admin or editor can see this\n        "),i("el-tag",{staticClass:"permission-sourceCode",attrs:{type:"info"}},[e._v("\n          v-if=\"checkPermission(['admin','editor'])\"\n        ")])],1):e._e()],1)],1)],1)},n=[],r=(i("6762"),i("2fdb"),i("4360")),a={inserted:function(e,s,i){var t=s.value,n=r["a"].getters&&r["a"].getters.roles;if(!(t&&t instanceof Array&&t.length>0))throw new Error("need roles! Like v-permission=\"['admin','editor']\"");var a=t,o=n.some(function(e){return a.includes(e)});o||e.parentNode&&e.parentNode.removeChild(e)}},o=function(e){e.directive("permission",a)};window.Vue&&(window["permission"]=a,Vue.use(o)),a.install=o;var l=a;function c(e){if(e&&e instanceof Array&&e.length>0){var s=r["a"].getters&&r["a"].getters.roles,i=e,t=s.some(function(e){return i.includes(e)});return!!t}return console.error("need roles! Like v-permission=\"['admin','editor']\""),!1}var m=function(){var e=this,s=e.$createElement,i=e._self._c||s;return i("div",[i("div",{staticStyle:{"margin-bottom":"15px"}},[e._v("\n    "+e._s(e.$t("permission.roles"))+": "+e._s(e.roles)+"\n  ")]),e._v("\n  "+e._s(e.$t("permission.switchRoles"))+":\n  "),i("el-radio-group",{model:{value:e.switchRoles,callback:function(s){e.switchRoles=s},expression:"switchRoles"}},[i("el-radio-button",{attrs:{label:"editor"}}),e._v(" "),i("el-radio-button",{attrs:{label:"admin"}})],1)],1)},d=[],v={computed:{roles:function(){return this.$store.getters.roles},switchRoles:{get:function(){return this.roles[0]},set:function(e){var s=this;this.$store.dispatch("user/changeRoles",e).then(function(){s.$emit("change")})}}}},p=v,u=i("2877"),h=Object(u["a"])(p,m,d,!1,null,null,null),_=h.exports,f={name:"DirectivePermission",components:{SwitchRoles:_},directives:{permission:l},data:function(){return{key:1}},methods:{checkPermission:c,handleRolesChange:function(){this.key++}}},g=f,w=(i("e835"),Object(u["a"])(g,t,n,!1,null,"17cb42c8",null));s["default"]=w.exports},e835:function(e,s,i){"use strict";var t=i("9963"),n=i.n(t);n.a}}]);