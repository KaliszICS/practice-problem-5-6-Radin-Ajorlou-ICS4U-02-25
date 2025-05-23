import java.util.ArrayList;
class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book newBook){
        this.books.add(newBook);
    }

    public void removeBook(String ISBN){
        int length = this.books.size();
        for (int i = 0; i < length; i++){
            if (this.books.get(i).getISBN().equals(ISBN)){
                this.books.remove(i);
            }
        }
    }

    public Book[] searchBook(String title){
        ArrayList<Book> searchedForBook = new ArrayList<>();
        int length = this.books.size();
        for (int i = 0 ; i < length ; i++){
            if (this.books.get(i).getTitle().equals(title)){
                searchedForBook.add(this.books.get(i));
            }
        }

        int newLength = searchedForBook.size();
        Book[] arrayOfBooks = new Book[newLength];
        for (int i = 0 ; i < newLength; i++){
            arrayOfBooks[i] = searchedForBook.get(i);
        }

        return arrayOfBooks;
    }

    public Book[] displayBooks(){
        int newLength = this.books.size();
        Book[] arrayOfBooks = new Book[newLength];
        for (int i = 0 ; i < newLength; i++){
            arrayOfBooks[i] = this.books.get(i);
        }

        return arrayOfBooks;
    }
}