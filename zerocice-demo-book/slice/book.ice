[["java:package:com.ice"]]
module book{
struct Message{
string name;  // 图书名称
int type;     // 类型；电子书、纸质书
bool valid;   // 若目前没有库存，则也预定成功
double price;  // 价格
string content; // 存放客户定制要求
};
    interface OnlineBook{
        Message bookTick(Message msg);
    };
};