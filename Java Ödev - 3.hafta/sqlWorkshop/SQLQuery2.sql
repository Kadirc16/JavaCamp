

--Bu kodlar bütün veritabanlarında çalışır.Bunlar ASII standartıdır.
--Büyük küçük harf duyarsızdır.Sql.
-- * tüm kolonları işaret eder.
-- Select * from Customers

-- Select ContactName,CompanyName,City from Customers
-- aslında biz böyle yaparak tablo oluşturmuş oluyoruz.

--Select ContactName Adi,CompanyName SirketAdi,City Sehri from Customers -- böyle yaparak ContactName yerine adi yazmış oluyoruz.Tabi bu geçici.

Select * from Customers where City = 'London' -- şehri londan olanları getir demiş oluyoruz.

Select * from Products

Select * from Products where CategoryID = 1

-- or diyerek ikisini de çalıştırabiliriz.Veya anlamına gelir.
Select * from Products where CategoryID = 1 or CategoryID = 3

-- and diyerek her iki seçenekte varsa çalıştırır.
Select * from Products where CategoryID = 1 and UnitPrice > 10

Select * from Products order by ProductName --order by sırala demek oluyor. Burada bütün ürünleri isme göre sıra demiş oluyoruz.

Select * from Products order by CategoryID,ProductName

Select * from Products order by UnitPrice desc  --ascending = artan anlamına geliyor asc'yi vermesekte olur.Azalandan artana sıralar.
											   --descending = azalan anlamına geliyor .desc ise artandan azalana doğru sıralar.

Select * from Products where CategoryID = 1 order by UnitPrice desc

Select count(*) UrunAdeti from Products --count bize sayı verir.

Select count(*) from Products where CategoryID = 4 --belirtilen categorid ile kaç tane ürün olduğunu bize verir.

Select CategoryID from Products group by CategoryID -- group by kullanacağımız zaman tüm kolonlar için değil yanlızca group by yapacağımız kolonu kullanmamız gerekiyor.
													-- Bu sonuç bize category ıdleri tekrar etmeyen şekilde gruplamış bir şekilde verir.

Select CategoryID,count(*) from Products group by CategoryID -- her bir id'ye ait kaç tane o üründen olduğunu verir bize.

Select CategoryID, count(*) from Products group by CategoryID having count(*)<10 -- burada ürün sayısı 10'dan küçük olan idleri ver demiş oluyoruz.Having kümületif dataya uygulanır yani "*" uygulanır.


Select CategoryID,count(*) from Products where UnitPrice<20 group by CategoryID having COUNT(*)<10


--inner join sadece iki tabloda da eşleşenleri bir araya getirir.
Select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID --burada "inner join" ile yanyana getiririz tabloları daha sonra "on" ile de neye göre yanyana getireceğimizi seçeriz.

Select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID

Select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>20

--köşeli parantez kullanmamızın tek sebebi order details'in arasında boşluk olmasından dolayı sql onu tek bir kod olarak algılasın diye yaparız.
Select * from Products p left join [Order Details] od -- left join solda olup sağda olmayanları getir demek oluyor.Yani products'da olup order detailste olmayanları da getir diyor.
on p.ProductID = od.ProductID


Select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null -- is null ifadesi boş olanları getir bana demek.Sorguda şunu yaptık Customerde olan idler orderda yoksa onlara bak ve orderda boş olanları getir demiş oluyoruz.
						   -- is null ifadesini primary key'e uygularız.


Select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID
inner join Orders o on o.OrderID = od.OrderID