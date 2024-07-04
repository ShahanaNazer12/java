class product{
int pcode;
String pname;
double price;
product(int a,String b,double c)
{
pcode = a;
pname = b;
price = c;
}
void display()
{
System.out.println(pcode+pname+price);
}
}
class productDemo{
static void findLowest(product p1,product p2,product p3)
{
if(p1.price<=p2.price && p1.price<=p3.price)
{
System.out.println("product1 has low price");
}
else if(p2.price<=p2.price && p2.price<=p3.price)
{
System.out.println("product2 has low price");
}
else
{
System.out.println("product 3 has low price");
}
}
public static void main(String[] args)
{
product obj1 =new product(1,"prod1",1000);
product obj2 =new product(2,"prod2",1200);
product obj3 =new product(3,"prod3",2000);
System.out.println("\nproduct_code\tproduct_name\tproduct_price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1,obj2,obj3);
}
}



