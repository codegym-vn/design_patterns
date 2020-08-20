package Creational;

public class SOSANH {}

/*BUILDER PATTERN & ABSTRACT FACTORY*/
    /*
    * Factory Pattern cũng có thể được sử dụng để xây dựng một đối tượng phức tạp, vậy sự khác biệt của nó với mô hình Builder Pattern là gì?

Sự khác biệt lớn duy nhất giữa Builder Pattern và Factory Pattern cung cấp cho bạn nhiều quyền kiểm soát hơn đối với quá trình tạo đối tượng.

Factory/ Abstract Factory Pattern là câu trả lời cho “WHAT” và Builder Pattern là câu trả lời cho “HOW“.

Trong Builder Pattern, đối tượng được xây dựng từng bước (step by step).
* Builder Pattern có nhiều bước nhỏ, mỗi bước sẽ có các đơn vị logic nhỏ kèm theo trong đó.
* Cũng sẽ có một chuỗi (sequence) liên quan. Nó sẽ bắt đầu từ bước 1 và sẽ đi lên tối đa bước n và bước cuối cùng là trả về đối tượng.
* Nhưng trong Factory Pattern, bạn sẽ không thấy được đối tượng phức tạp được tạo như thế nào, nó không có từng bước xây dựng đối tượng.
    * */