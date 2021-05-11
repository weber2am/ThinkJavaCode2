
class Calories {

    public static void main(String[] args) {
        int years = 25;
        int feet = 5;
        int inches = 10;
        int pounds = 160;
        int ounces = 3;
        double weight = (16 * pounds + ounces) * 0.0283495;
        double height = (12 * feet + inches) * 2.54;
        double bmr_base = 10 * weight + 6.25 * height - 5 * years;
        System.out.print("Male BMR = ");
        System.out.print(bmr_base + 5);
        System.out.println(" calories/day.");
        System.out.print("Female BMR = ");
        System.out.print(bmr_base - 161);
        System.out.println(" calories/day.");
    }
}
