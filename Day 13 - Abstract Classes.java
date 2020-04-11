class MyBook extends Book
{
    private int price;

    MyBook(String t, String a, int p)
    {
         super(t, a);
        price = p;
    }
    void display()
    {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}