# 数据结构
## 第一章 绪论
### 基本概念和术语
- 数据：描述客观事物的符号，计算机中可以操作的对象，能被计算机识别并输入给计算机处理的符号集合。
- 数据元素：组成数据的，有一定意义的基本单位，在计算机中通常作为整体处理。
- 数据项：一个数据元素由若干个数据项组成。
  - 数据不可分割的最小单位
- 数据对象：性质相同的数据元素的集合，是数据的子集。
- 数据结构：相知之间存在一种或多种特定关系的数据元素的集合。
### 数据结构三要素
1. 逻辑结构
   1. 集合结构
   2. 线性结构
   3. 树形结构
   4. 图形结构
2. 物理结构
   1. 顺序存储
   2. 链式存储
   3. 索引存储
   4. 散列存储
### 抽象数据类型（Abstract Data Type，ADT）
> 定义：一个数学模型及定义在该模型上的一组操作。

```JavaScript{.line-numbers}
ADT 抽象数据类名
Data
   数据元素之间逻辑关系的定义
Operation
   操作1
      初始条件
      操作结果描述
   操作2
   ...
   操作n
   ...
endADT
```

## 第二章 线性表
### 2.1 定义
> 线性表（List）：零个或多个数据元素的有限序列。

### 2.2 抽象数据类型
```JavaScript{.line-numbers}
ADT 线性表(List)
Data
   线性表的数据对象集合为{a1，a2，...，an}，每个元素的类型均为DataType。
   其中，除第一个元素外，每一个元素有且仅有一个直接前驱，
   除了最后一个元素外，每一个元素有且仅有一个直接后继。
   数据元素之间是一对一的关系。
Operation
   InitList(*L);
   ListEmpty(L);
   ClearList(*L);
   GetElem(L,i,*e);
   LocateElem(L,e);
   ListInsert(*L,i,e);
   ListDelete(*L,i,*e);
   ListLength(L);
endADT
```

### 2.3 线性表的顺序存储结构
```JavaScript{.line-numbers}
#define MaxSize 50
typedef struct{
   ElemType data[MaxSize];
   int length;
}SqList;
```
### 2.4 线性表的链式存储结构
```JavaScript{.line-numbers}
typedef struct LNode{
   ElemType data;
   struct LNode *next;
}LNode,*LinkList;
```

单链表是非随机存取的存储结构，为了查找某个特定的节点时，需要从头开始遍历，依次查找。

头指针始终指向链表的第一个节点，而头节点是带头节点的链表中的第一个节点。

#### 2.4.1 头插法
#### 2.4.2 尾插法


## 第三章 栈和队列