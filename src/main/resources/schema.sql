DROP TABLE IF EXISTS PRODUCTS;
CREATE TABLE PRODUCTS 
    (
     product_id int auto_increment primary key, 
     name varchar(30) NOT NULL, 
     description varchar(30) NOT NULL

    );
    
DROP TABLE IF EXISTS PRODUCTS_VARIANTS;
CREATE TABLE PRODUCTS_VARIANTS
    (
     variant_id int auto_increment primary key, 
	 product_id int references PRODUCTS(product_id),
	 size varchar(30),
     brand varchar(30), 
	 color varchar(30), 
	 seller varchar(30), 
	 price double, 
	 sku int 
    );
