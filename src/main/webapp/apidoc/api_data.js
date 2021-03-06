define({ "api": [
  {
    "name": "areaList",
    "group": "Base",
    "version": "1.0.0",
    "description": "<p>地区列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": true,
            "field": "hot",
            "description": "<p>热门分类  1：热门分类</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>地区ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "areaName",
            "description": "<p>地区名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "pingyin",
            "description": "<p>首字母拼音</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "hot",
            "description": "<p>1:热门 0:普通</p>"
          },
          {
            "group": "Success 200",
            "type": "List",
            "optional": false,
            "field": "model",
            "description": "<p>验证码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n\t\"model\": \"[\n {\n      \"id\": 1,\n      \"areaName\": \"深圳\"\n  },\n  {\n      \"id\": 2,\n      \"areaName\": \"广州\"\n  }\n]\", \n\t\"success\": true,\n\t\"errorMessage\": null,\n\t\"resultCode\": 200\n}",
          "type": "json"
        }
      ]
    },
    "type": "",
    "url": "",
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Base",
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "405",
            "description": "<p>对应<code>405</code> 远程服务器调用失败</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Response 405 Example",
          "content": "  HTTP/1.1 405 Internal Server Error\n  {\n\t\t\"model\": null,\n\t\t\"success\": false,\n\t\t\"errorMessage\": 远程服务器调用失败,\n\t\t\"resultCode\": 405\n  }",
          "type": "json"
        }
      ]
    }
  },
  {
    "name": "getui",
    "group": "Base",
    "version": "1.0.0",
    "description": "<p>个推参数定义</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "notifyType",
            "description": "<p>通知类型 1:活动公告    2：系统通知  3订单通知 前台那有问题没</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "openType",
            "description": "<p>打开类型 101：活动公告，进入h5  201:审核通知，进入审核界面 202：新增推荐人, 203:用户点赞能知，进入个人主页 204：提现审核通知，进入提现详情 205:退款通知  206:服务驳回 \t\t\t\t\t\t\t\t\t207：同意退款 208：拒绝退款 \t\t\t\t\t\t\t\t\t209:用户关注  210：取消关注 301：订单通知 进入订单详情  302：订单通知 进入服务详情</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "image",
            "description": "<p>图标</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "userId",
            "description": "<p>推送人ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "date",
            "description": "<p>通知时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "orderId",
            "description": "<p>订单ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "withdrawId",
            "description": "<p>提现ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "url",
            "description": "<p>地址</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Base"
  },
  {
    "type": "get",
    "url": "/rest/commonIntf/categroyList",
    "title": "分类列表",
    "name": "categroyList",
    "group": "Common",
    "version": "1.0.0",
    "description": "<p>分类列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>分类代码</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>分类ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>分类代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>分类名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "image",
            "description": "<p>分类图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "parent",
            "description": "<p>分类上级</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n\t\"model\": \"[\n {\n      \"id\": 1,\n      \"code\": \"A01A01\"\n      \"name\": \"深圳地区\"\n      \"image\": \"upload\\image\\11.png\"\n      \"parent\": \"A01\"\n  }\n]\", \n\t\"success\": true,\n\t\"errorMessage\": null,\n\t\"resultCode\": 200\n}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Common",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/commonIntf/categroyList"
      }
    ],
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "405",
            "description": "<p>对应<code>405</code> 远程服务器调用失败</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Response 405 Example",
          "content": "  HTTP/1.1 405 Internal Server Error\n  {\n\t\t\"model\": null,\n\t\t\"success\": false,\n\t\t\"errorMessage\": 远程服务器调用失败,\n\t\t\"resultCode\": 405\n  }",
          "type": "json"
        }
      ]
    }
  },
  {
    "type": "get",
    "url": "/rest/commonIntf/dicList",
    "title": "词典列表",
    "name": "dicList",
    "group": "Common",
    "version": "1.0.0",
    "description": "<p>词典列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "dicCode",
            "description": "<p>词典代码</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>地区ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>词典代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>词典名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n\t\"model\": \"[\n {\n      \"id\": 1,\n      \"code\": \"1\"\n      \"name\": \"深圳地区\"\n  }\n]\", \n\t\"success\": true,\n\t\"errorMessage\": null,\n\t\"resultCode\": 200\n}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Common",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/commonIntf/dicList"
      }
    ],
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "405",
            "description": "<p>对应<code>405</code> 远程服务器调用失败</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Response 405 Example",
          "content": "  HTTP/1.1 405 Internal Server Error\n  {\n\t\t\"model\": null,\n\t\t\"success\": false,\n\t\t\"errorMessage\": 远程服务器调用失败,\n\t\t\"resultCode\": 405\n  }",
          "type": "json"
        }
      ]
    }
  },
  {
    "type": "get",
    "url": "/rest/commonIntf/sendMessage",
    "title": "获取短信验证码",
    "name": "sendMessage",
    "group": "Common",
    "version": "1.0.0",
    "description": "<p>根据手机号码返回短信验证码</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "mobile",
            "description": "<p>手机号码</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>验证码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n\t\"model\": \"760428\",\n\t\"success\": true,\n\t\"errorMessage\": null,\n\t\"resultCode\": 200\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "301",
            "description": "<p>对应<code>301</code> 手机号码为空</p>"
          },
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "302",
            "description": "<p>对应<code>302</code> 短信发送失败</p>"
          },
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "405",
            "description": "<p>对应<code>405</code> 远程服务器调用失败</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response: ",
          "content": " 手机号码为空\n{\n\t\"model\": null,\n\t\"success\": false,\n\t\"errorMessage\": 手机号码为空,\n\t\"resultCode\": 301\n}",
          "type": "json"
        },
        {
          "title": "Response 405 Example",
          "content": "  HTTP/1.1 405 Internal Server Error\n  {\n\t\t\"model\": null,\n\t\t\"success\": false,\n\t\t\"errorMessage\": 远程服务器调用失败,\n\t\t\"resultCode\": 405\n  }",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Common",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/commonIntf/sendMessage"
      }
    ]
  },
  {
    "type": "post",
    "url": "/rest/commonIntf/uploadImg",
    "title": "上传图片接口",
    "name": "uploadImg",
    "group": "Common",
    "version": "1.0.0",
    "description": "<p>上传图片接口,返回绝对路径,都是指定以png后辍结尾</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "MultipartFile",
            "optional": false,
            "field": "fileName",
            "description": "<p>文件数据流</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "viewPath",
            "description": "<p>文件预览路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "filePath",
            "description": "<p>文件保存的绝对路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n\t\"model\": {\n\t\t\"filePath\": \"/upload/sc/images/20161227005210KOI5P4ew.png\",\n\t\t\"viewPath\": \"http://127.0.0.1:90/upload/sc/images/20161227005210KOI5P4ew.png\"\n\t},\n\t\"success\": true,\n\t\"errorMessage\": null,\n\t\"resultCode\": 200\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "305",
            "description": "<p>对应<code>305</code> 图片保存失败</p>"
          },
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "405",
            "description": "<p>对应<code>405</code> 远程服务器调用失败</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Response 405 Example",
          "content": "  HTTP/1.1 405 Internal Server Error\n  {\n\t\t\"model\": null,\n\t\t\"success\": false,\n\t\t\"errorMessage\": 远程服务器调用失败,\n\t\t\"resultCode\": 405\n  }",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/common/CommonIntf.java",
    "groupTitle": "Common",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/commonIntf/uploadImg"
      }
    ]
  },
  {
    "type": "POST",
    "url": "/rest/ysAboutIntf/addYsAbout",
    "title": "添加项目介绍",
    "name": "addYsAbout",
    "group": "YsAbout",
    "version": "1.0.0",
    "description": "<p>添加项目介绍</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectName",
            "description": "<p>名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectUrl",
            "description": "<p>网址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "about",
            "description": "<p>关于项目</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "synopsis",
            "description": "<p>简介</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "logo",
            "description": "<p>logo</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "images",
            "description": "<p>公司图片</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "serviceTel",
            "description": "<p>客服电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "qqNumber",
            "description": "<p>QQ</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weixinNumber",
            "description": "<p>微信号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weixinImage",
            "description": "<p>微信二维码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "mail",
            "description": "<p>邮箱</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weiboNumber",
            "description": "<p>微博</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectAddress",
            "description": "<p>地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "legalPerson",
            "description": "<p>法人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "businessLicense",
            "description": "<p>营业执照</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "licenseNo",
            "description": "<p>执照号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "idNumber",
            "description": "<p>身份证号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备注</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>返回成功信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n \"result\": {\n\t\"model\": {\n\t\t\"添加成功\"\n\t},\n\t  \"status\": {\n\t    \"code\": 200,\n\t    \"msg\": \"请求成功\"\n\t  }\n\t}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/about/intf/YsAboutIntf.java",
    "groupTitle": "YsAbout",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/ysAboutIntf/addYsAbout"
      }
    ]
  },
  {
    "type": "POST",
    "url": "/rest/ysAboutIntf/deleteYsAbout",
    "title": "删除项目介绍",
    "name": "deleteYsAbout",
    "group": "YsAbout",
    "version": "1.0.0",
    "description": "<p>删除项目介绍</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>项目介绍ID</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>返回成功信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n \"result\": {\n\t\"model\": {\n\t\t\"删除成功\"\n\t},\n\t  \"status\": {\n\t    \"code\": 200,\n\t    \"msg\": \"请求成功\"\n\t  }\n\t}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/about/intf/YsAboutIntf.java",
    "groupTitle": "YsAbout",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/ysAboutIntf/deleteYsAbout"
      }
    ]
  },
  {
    "type": "GET",
    "url": "/rest/ysAboutIntf/getId",
    "title": "获取项目介绍信息",
    "name": "getId",
    "group": "YsAbout",
    "version": "1.0.0",
    "description": "<p>获取项目介绍信息</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>返回成功信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectName",
            "description": "<p>名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectUrl",
            "description": "<p>网址</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "about",
            "description": "<p>关于项目</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "synopsis",
            "description": "<p>简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "logo",
            "description": "<p>logo</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "images",
            "description": "<p>公司图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "serviceTel",
            "description": "<p>客服电话</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "qqNumber",
            "description": "<p>QQ</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weixinNumber",
            "description": "<p>微信号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weixinImage",
            "description": "<p>微信二维码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "mail",
            "description": "<p>邮箱</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weiboNumber",
            "description": "<p>微博</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectAddress",
            "description": "<p>地址</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "legalPerson",
            "description": "<p>法人</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "businessLicense",
            "description": "<p>营业执照</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "licenseNo",
            "description": "<p>执照号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "idNumber",
            "description": "<p>身份证号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备注</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n \"result\": {\n\t\"model\": {\n\t\t\n\t},\n\t  \"status\": {\n\t    \"code\": 200,\n\t    \"msg\": \"请求成功\"\n\t  }\n\t}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/about/intf/YsAboutIntf.java",
    "groupTitle": "YsAbout",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/ysAboutIntf/getId"
      }
    ]
  },
  {
    "type": "POST",
    "url": "/rest/ysAboutIntf/updateYsAbout",
    "title": "修改项目介绍",
    "name": "updateYsAbout",
    "group": "YsAbout",
    "version": "1.0.0",
    "description": "<p>修改项目介绍</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectName",
            "description": "<p>名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectUrl",
            "description": "<p>网址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "about",
            "description": "<p>关于项目</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "synopsis",
            "description": "<p>简介</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "logo",
            "description": "<p>logo</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "images",
            "description": "<p>公司图片</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "serviceTel",
            "description": "<p>客服电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "qqNumber",
            "description": "<p>QQ</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weixinNumber",
            "description": "<p>微信号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weixinImage",
            "description": "<p>微信二维码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "mail",
            "description": "<p>邮箱</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "weiboNumber",
            "description": "<p>微博</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectAddress",
            "description": "<p>地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "legalPerson",
            "description": "<p>法人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "businessLicense",
            "description": "<p>营业执照</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "licenseNo",
            "description": "<p>执照号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "idNumber",
            "description": "<p>身份证号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备注</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>返回成功信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n \"result\": {\n\t\"model\": {\n\t\t\"修改成功\"\n\t},\n\t  \"status\": {\n\t    \"code\": 200,\n\t    \"msg\": \"请求成功\"\n\t  }\n\t}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/about/intf/YsAboutIntf.java",
    "groupTitle": "YsAbout",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/ysAboutIntf/updateYsAbout"
      }
    ]
  },
  {
    "type": "GET",
    "url": "/rest/ysAboutIntf/ysAboutList",
    "title": "项目介绍列表",
    "name": "ysAboutList",
    "group": "YsAbout",
    "version": "1.0.0",
    "description": "<p>项目介绍列表</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "model",
            "description": "<p>返回成功信息</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultCode",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "errorMessage",
            "description": "<p>错误消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>是否成功</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectName",
            "description": "<p>名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectUrl",
            "description": "<p>网址</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "about",
            "description": "<p>关于项目</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "synopsis",
            "description": "<p>简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "logo",
            "description": "<p>logo</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "images",
            "description": "<p>公司图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "serviceTel",
            "description": "<p>客服电话</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "qqNumber",
            "description": "<p>QQ</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weixinNumber",
            "description": "<p>微信号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weixinImage",
            "description": "<p>微信二维码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "mail",
            "description": "<p>邮箱</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "weiboNumber",
            "description": "<p>微博</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "projectAddress",
            "description": "<p>地址</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "legalPerson",
            "description": "<p>法人</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "businessLicense",
            "description": "<p>营业执照</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "licenseNo",
            "description": "<p>执照号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "idNumber",
            "description": "<p>身份证号</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备注</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response: ",
          "content": " HTTP/1.1 200 OK \n{\n \"result\": {\n\t\"model\": {\n\t\t\n\t},\n\t  \"status\": {\n\t    \"code\": 200,\n\t    \"msg\": \"请求成功\"\n\t  }\n\t}",
          "type": "json"
        }
      ]
    },
    "filename": "D:/developer/geecg/jewelry2.0/src/main/java/com/yisi/business/about/intf/YsAboutIntf.java",
    "groupTitle": "YsAbout",
    "sampleRequest": [
      {
        "url": "http://127.0.0.1:98/rest/ysAboutIntf/ysAboutList"
      }
    ]
  }
] });
