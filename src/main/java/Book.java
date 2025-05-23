class Book{

    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getISBN(){
        return this.ISBN;
    }
}