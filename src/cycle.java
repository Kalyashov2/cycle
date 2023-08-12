public class cycle {
    public static void main(String[] args) {
for (int i = 0; i < 11; i++) {
        System.out.println("Итерация цикла " + i); }

for (int g = 10; g > 0 ; g--){
    System.out.println("Итерация цикла " + g); }

for (int z = 0; z < 18; z++ ) {
    if (z % 2 == 0) {
        System.out.println("Итерация цикла " + z);
    }
}

for (int u = 10; u > -11; u--) {
    System.out.println("Итерация цикла " + u); }

for (int w = 1904; w < 2096; w = w + 4) {
    System.out.println(w + " високосный год"); }

for (int o = 7; o < 99; o = o + 7) {
    System.out.println(o); }

for (int t = 1; t < 513; t = t * 2)
{
    System.out.println(t); }

int money = 29000;
int total = 0;
for (int x = 0; x < 12; x++)
total = total + money;
{
    System.out.println("За 12 месяцев сумма накопления равна " + total); }

int money2 = 29000;
        int total2 = 0;
        for (int j = 0; j < 12; j++)
            total2 = total2 + total2/100;
        total2 = total2 + money2;

    {
        System.out.println(total2); }


    }
}
