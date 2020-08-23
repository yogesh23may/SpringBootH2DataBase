INSERT INTO PRODUCTS(name, description)VALUES
('Jeans', 'a form of trouser'),
('Caps', 'for casual wear');

INSERT INTO PRODUCTS_VARIANTS(product_id,size, brand,color,seller,price,sku)VALUES
(1,'30','levis','blue','seller1',2500.0,1000),
(1,'32','levis','black','seller1',3500.0,1000),
(1,'30','lee','blue','seller2',2700.0,1100),
(1,'32','lee','black','seller2',3700.0,1100),
(1,'30','wrangler','blue','seller3',2900.0,1200),
(1,'32','wrangler','black','seller3',3900.0,1200),
(2,'S','nike','black','seller4',1500.0,1500),
(2,'M','nike','white','seller4',1500.0,1500),
(2,'L','nike','green','seller4',1500.0,1500),
(2,'S','adidas','black','seller5',1300.0,1300),
(2,'M','adidas','white','seller5',1300.0,1300),
(2,'L','adidas','green','seller5',1300.0,1300);