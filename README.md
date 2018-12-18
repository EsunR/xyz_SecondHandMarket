# xyz_SecondhandMarket Berch_force
## 校园猪-二手市场板块   
![](http://pj1wbw4gq.bkt.clouddn.com/18-12-9/59339898.jpg)
> 声明：本项目仅为前端预览版，非商用版本  
> 地球不爆炸项目不停止
> 
> 演示地址：http://47.106.226.190/Git/xyz_SecondhandMarket/
---

## 配色
### 通用色
+ 网页背景色：#F4F4F5

### 二手市场
+ 主色：#FEC018
+ 深主色：#DFA711

### 提供需求
+ 主色：#107BFD
+ 深主色：#0B69D7

### 发布需求
+ 主色：#24A647
+ 深主色：#1E8739

---

## Data数据文件说明
在项目根目录下有Data文件夹，存放用户信息和商品信息
### 商品信息
路径：/Data/SecondHand/Item/item_id/  

说明：item_id为商品id命名的文件夹，遵循以下命名规则：
+ 商品封面：cover.jpg  
+ 商品展示中的其他图片：itemId_1.jgp, itemId_2.jgp, itemId_3.jgp ...  


### 用户信息
路径：/Data/User/user_id/

说明：uer_id为用户id命名的文件夹，遵循以下命名规则：
+ 用户头像：head.png

---

## 数据库
PS：数据库字段命名方法采用驼峰式命名，如 `user name` 应该命名为 `userName` 与接口的命名方式保持一致。
### user 表
> 该表存放了用户的个人信息

+ id: 用户ID
+ name: 用户名
+ school: 用户所在学校
+ level: 用户信誉等级（默认为良好）
+ phone: 联系电话
+ qq: 联系QQ
+ wechat: 联系微信

### item 表
> 该表存放了商品的信息

+ id: 商品ID
+ title: 商品名称
+ price: 商品价格
+ oldPrice: 商品原价
+ condition: 商品成色
+ sellerId: 卖家ID
+ description: 商品描述
+ sellerName: 卖家称呼（与卖家的昵称区分开）
+ sellerContactWay: 卖家联系方式 （传递参数：1-QQ，2-微信，3-电话）
+ sellerContact: 联系号码（QQ号、微信号、电话）