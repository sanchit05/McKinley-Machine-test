pragma solidity >=0.4.0 <0.7.0;

contract BookRetrive{
    struct Book{
        uint id;
        string name;
    }
    Book book;

    mapping(uint => Book) private bookarray;

    uint private candidatesCount;

   constructor() public{
      addBook("Java", 1);
      addBook("blockchain", 2);
   }

   function addBook(string memory _name, uint book_id)private{

        candidatesCount ++;
        bookarray[candidatesCount] = Book(book_id,_name);

    }
  
  function getBook(uint book_id) public view returns (string memory){
      
      return bookarray[book_id].name;
      
  }

}
