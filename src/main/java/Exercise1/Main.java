package Exercise1;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 250);
        //System.out.println(phone.weight+ " "+phone.price);
      /*  MobilePhone phone1 = new MobilePhone("185g", 1999);
        System.out.println(phone1.price+" "+phone1.price);*/
        /*phone.displayValues();
        String parameters = phone.getParameters();
        System.out.println(parameters);
        int phonePrice = phone.getPrice();
        System.out.println(phonePrice);
        int discountPricePhone = phone.discountPricePhone();
        System.out.println(discountPricePhone);
        phone.specialPricePhone();
        phone1.specialPricePhone();
        phone.checkPrice();
        phone1.checkPrice();
        phone.loop(-1, 11);*/
        //phone.isDivided(4, 18);
        //phone.evenNumbers(5, 9);
        phone.getNumbers(-2, 5);


    }
}
class MobilePhone{
    String weight;
    int price;

    public MobilePhone(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void displayValues(){
        System.out.println(this.weight+ " "+this.price);
    }
    public String getParameters(){
        return weight +" "+price;
    }
    public int getPrice(){
        return (this.price);
    }
    public int discountPricePhone(){
        return (this.price-(price/10));
    }
    public void specialPricePhone(){
        System.out.println("Special price phone: "+(this.price+price));
    }

    public void checkPrice(){
        if (this.price<200) {
            System.out.println("price is very good");
        }else if (this.price<300){
            System.out.println("price is good");
        }else if (this.price<550){
            System.out.println("price could be low");
        }else {
            System.out.println("This phone is too expensive");
        }
    }
    public void loop(int min, int max){
        for (int i=min;i<=max;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
    public void isDivided(int min, int max){
        int sum=0;
        int a=0;
        for (int i=min; i<=max;i++){
            if (i%3==0||i%5==0){
                System.out.println(i);
                a++;
                sum=sum+i;
            }
        }
        System.out.println("ilość a "+a);
        System.out.println(sum);

    }
    public void evenNumbers(int min, int max){
        int b=0;
        for (int i = min; i<=max;i++){
            if (i%2==0){
                b=b+i;
            }
        }
        System.out.println("suma: "+b);
    }
    public void getNumbers(int min, int max){
        int sum=0;
        for (int i =min;i<=max;i++){
            System.out.println(i);
        }

    }

}
