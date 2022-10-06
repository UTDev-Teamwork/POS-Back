SET SCHEMA 'pos_admin';
 
/* SQLINES DEMO *** le [dbo].[articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.articulo(
	cod_barras varchar(15) NOT NULL,
	cod_asociado varchar(15) NULL,
	id_clasificacion bigint NOT NULL,
	cod_interno varchar(15) NULL,
	descripcion varchar(80) NOT NULL,
	descripcion_corta varchar(30) NOT NULL,
	cantidad_um decimal(19, 3) NOT NULL,
	id_unidad Char(36) NOT NULL,
	id_proveedor Char(36) NOT NULL,
	precio_compra decimal(19, 3) NOT NULL,
	utilidad decimal(19, 3) NOT NULL,
	precio_venta decimal(19, 3) NOT NULL,
	tipo_articulo varchar(50) NOT NULL,
	stock decimal(19, 3) NOT NULL,
	stock_min decimal(19, 3) NOT NULL,
	stock_max decimal(19, 3) NOT NULL,
	iva decimal(4, 2) NOT NULL,
	kit_fecha_ini Timestamp(3) NULL,
	kit_fecha_fin Timestamp(3) NULL,
	articulo_disponible Boolean NOT NULL,
	kit Boolean NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
	visible Boolean NOT NULL,
	puntos smallint NOT NULL,
	last_update_inventory Timestamp(3) NOT NULL,
	cve_producto varchar(15) NOT NULL,
 CONSTRAINT pk_articulo PRIMARY KEY 
(
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[articulos]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.articulos(
	cod_barras varchar(15) NOT NULL,
	cod_asociado varchar(15) NULL,
	cod_interno varchar(15) NULL,
	descripcion varchar(80) NOT NULL,
	descripcion_corta varchar(30) NOT NULL,
	cantidad_um decimal(19, 3) NOT NULL,
	id_unidad Char(36) NOT NULL,
	id_proveedor Char(36) NOT NULL,
	precio_compra decimal(19, 3) NOT NULL,
	utilidad decimal(19, 3) NOT NULL,
	precio_venta decimal(19, 3) NOT NULL,
	tipo_articulo varchar(50) NOT NULL,
	iva decimal(4, 2) NOT NULL,
	articulo_disponible Boolean NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key31 PRIMARY KEY 
(
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[clasificacion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.clasificacion(
	id_clasificacion bigint GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
	id_clasificacion_dep bigint NULL,
	descripcion varchar(100) NOT NULL,
	nivel_clasificacion smallint NOT NULL,
 CONSTRAINT pk_categoria PRIMARY KEY 
(
	id_clasificacion 
) ,
 CONSTRAINT fk_clasificacion UNIQUE 
(
	id_clasificacion 
) 
);
/* SQLINES DEMO *** le [dbo].[clave_producto_serv]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.clave_producto_serv(
	id varchar(10) NOT NULL,
	descripcion varchar(120) NOT NULL,
	trasladado varchar(10) NOT NULL,
	ieps_trasladado varchar(10) NOT NULL,
	franja_fronteriza smallint NOT NULL,
	palabras_similares varchar(252) NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[cliente]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.cliente(
	id_cliente Char(36) NOT NULL,
	rfc varchar(15) NOT NULL,
	razon_social varchar(120) NOT NULL,
	regimen_fiscal Varchar(5) NULL,
	contacto varchar(100) NULL,
	e_mail varchar(80) NULL,
	e_mail2 varchar(80) NULL,
 CONSTRAINT pk_cliente PRIMARY KEY 
(
	id_cliente 
) ,
 CONSTRAINT uq_rfc_cliente UNIQUE 
(
	rfc 
) 
);
/* SQLINES DEMO *** le [dbo].[compra]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.compra(
	id_compra Char(36) NOT NULL,
	id_proveedor Char(36) NULL,
	no_factura varchar(20) NULL,
	fecha_compra Timestamp(3) NOT NULL,
	id_pedido Char(36) NULL,
	cancelada Boolean NOT NULL,
	fecha_cancelacion Timestamp(3) NULL,
	no_entrada smallint NOT NULL,
	observaciones varchar(100) NULL,
 CONSTRAINT pk_compra PRIMARY KEY 
(
	id_compra 
) 
);
/* SQLINES DEMO *** le [dbo].[compra_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.compra_articulo(
	id_compra Char(36) NOT NULL,
	cod_barras varchar(15) NOT NULL,
	num_articulo smallint NOT NULL,
	cant_cja decimal(19, 3) NOT NULL,
	cant_pza decimal(19, 3) NOT NULL,
	precio_compra decimal(19, 3) NOT NULL,
	no_captura smallint NOT NULL,
	no_entrega decimal(19, 3) NOT NULL,
 CONSTRAINT pk_compra_articulo PRIMARY KEY 
(
	id_compra,
	num_articulo,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[control_errores]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.control_errores(
	id_error Char(36) NOT NULL,
	aplicacion varchar(60) NOT NULL,
	host varchar(50) NOT NULL,
	tipo varchar(100) NOT NULL,
	origen varchar(60) NOT NULL,
	mensage varchar(500) NOT NULL,
	usuario varchar(50) NOT NULL,
	cod_status int NOT NULL,
	time_utc Timestamp(3) NOT NULL,
	secuencia int NOT NULL,
	all_xml Text NOT NULL,
 CONSTRAINT key21 PRIMARY KEY 
(
	id_error 
) 
);
/* SQLINES DEMO *** le [dbo].[ctrl_errores]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.ctrl_errores(
	id_error Char(36) NOT NULL,
	fecha_log Timestamp(3) NOT NULL,
	descripcion Text NOT NULL,
 CONSTRAINT key34 PRIMARY KEY 
(
	id_error 
) 
);
/* SQLINES DEMO *** le [dbo].[direccion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.direccion(
	id_direccion Char(36) NOT NULL,
	id_cliente Char(36) NOT NULL,
	id_municipio smallint NOT NULL,
	id_entidad smallint NOT NULL,
	codigo_postal Varchar(5) NOT NULL,
	colonia Varchar(100) NULL,
	calle Varchar(80) NULL,
	no_interior Varchar(20) NULL,
	no_exterior Varchar(20) NULL,
 CONSTRAINT PK_direccion_1 PRIMARY KEY 
(
	id_direccion 
) 
);
/* SQLINES DEMO *** le [dbo].[direccion_proveedor]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.direccion_proveedor(
	id_proveedor Char(36) NOT NULL,
	calle varchar(100) NULL,
	no_int varchar(10) NULL,
	no_ext varchar(10) NULL,
	colonia varchar(100) NULL,
	localidad varchar(100) NULL,
	id_entidad smallint NULL,
	id_municipio smallint NULL,
	pais varchar(20) NOT NULL,
	cod_postal varchar(10) NULL,
 CONSTRAINT pk_direccion PRIMARY KEY 
(
	id_proveedor 
) 
);
/* SQLINES DEMO *** le [dbo].[empleado]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.empleado(
	id_empleado Char(36) NOT NULL,
	nombre varchar(60) NOT NULL,
	a_paterno varchar(60) NOT NULL,
	a_materno varchar(80) NOT NULL,
	user_name varchar(15) NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT pk_empleado PRIMARY KEY 
(
	id_empleado 
) 
);
/* SQLINES DEMO *** le [dbo].[empresa]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.empresa(
	rfc varchar(18) NOT NULL,
	razon_social varchar(100) NOT NULL,
	representante varchar(100) NULL,
	calle varchar(100) NOT NULL,
	no_ext varchar(20) NOT NULL,
	no_int varchar(20) NULL,
	colonia varchar(150) NOT NULL,
	municipio varchar(100) NOT NULL,
	estado varchar(100) NOT NULL,
	pais varchar(50) NOT NULL,
	codigo_postal varchar(10) NOT NULL,
	tel_principal varchar(30) NULL,
	e_mail varchar(100) NULL,
	logo Bytea NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key3 PRIMARY KEY 
(
	rfc 
) 
);
/* SQLINES DEMO *** le [dbo].[entidad]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.entidad(
	id_entidad smallint NOT NULL,
	nombre varchar(40) NOT NULL,
 CONSTRAINT pk_estado PRIMARY KEY 
(
	id_entidad 
) 
);
/* SQLINES DEMO *** le [dbo].[entrada]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.entrada(
	id_entrada Char(36) NOT NULL,
	num_entrada bigint NOT NULL,
	fecha_entrada Timestamp(3) NOT NULL,
	observacion text NULL,
	id_movto bigint NULL,
	user_name varchar(15) NULL,
	cancelada Boolean NOT NULL,
	fecha_cancelacion Timestamp(3) NULL,
 CONSTRAINT key6 PRIMARY KEY 
(
	id_entrada 
) 
);
/* SQLINES DEMO *** le [dbo].[entrada_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.entrada_articulo(
	id_entrada Char(36) NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cant_ent decimal(19, 3) NOT NULL,
	cant_pza decimal(19, 3) NOT NULL,
	cant_reg decimal(19, 3) NOT NULL,
	costo decimal(19, 3) NOT NULL,
 CONSTRAINT key8 PRIMARY KEY 
(
	id_entrada,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[estadistica]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.estadistica(
	anio smallint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	ene decimal(19, 3) NOT NULL,
	feb decimal(19, 3) NOT NULL,
	mar decimal(19, 3) NOT NULL,
	abr decimal(19, 3) NOT NULL,
	may decimal(19, 3) NOT NULL,
	jun decimal(19, 3) NOT NULL,
	jul decimal(19, 3) NOT NULL,
	ago decimal(19, 3) NOT NULL,
	sep decimal(19, 3) NOT NULL,
	oct decimal(19, 3) NOT NULL,
	nov decimal(19, 3) NOT NULL,
	dic decimal(19, 3) NOT NULL,
 CONSTRAINT key17 PRIMARY KEY 
(
	anio,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[estatus]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.estatus(
	id_estatus smallint GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
	descripcion varchar(50) NULL,
 CONSTRAINT PK_estatus PRIMARY KEY 
(
	id_estatus 
) 
);
/* SQLINES DEMO *** le [dbo].[exportacion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.exportacion(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[factura]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.factura(
	id_factura bigint NOT NULL,
	id_cliente Char(36) NOT NULL,
	fecha_remision Timestamp(3) NOT NULL,
	uso_cfdi Varchar(5) NULL,
	forma_pago Char(10) NULL,
	metodo_pago Char(10) NULL,
	tipo_comprobante Char(10) NULL,
	exportaciones Char(10) NULL,
	id_estatus smallint NULL,
	factura_xml Text NULL,
	uuid_sat Char(36) NULL,
 CONSTRAINT pk_factura PRIMARY KEY 
(
	id_factura 
) 
);
/* SQLINES DEMO *** le [dbo].[factura_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.factura_articulo(
	id_factura_articulo Char(36) NOT NULL,
	id_factura bigint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	descripcion varchar(80) NOT NULL,
	id_unidad Char(36) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
	iva decimal(4, 3) NOT NULL,
	precio_vta decimal(19, 3) NOT NULL,
 CONSTRAINT key24 PRIMARY KEY 
(
	id_factura_articulo 
) 
);
/* SQLINES DEMO *** le [dbo].[factura_venta]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.factura_venta(
	id_pos int NOT NULL,
	id_venta Char(36) NOT NULL,
	id_factura bigint NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key19 PRIMARY KEY 
(
	id_venta,
	id_pos 
) 
);
/* SQLINES DEMO *** le [dbo].[forma_pago]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.forma_pago(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	bancarizado varchar(10) NOT NULL,
	num_operacion varchar(10) NOT NULL,
	rfc_ordenante varchar(10) NOT NULL,
	cuenta_ordenante varchar(10) NOT NULL,
	rfc_beneficiario varchar(10) NOT NULL,
	cuenta_beneficiario varchar(10) NOT NULL,
	tipo_pago varchar(10) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[generacion_codigos]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.generacion_codigos(
	id_gencode bigint GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
	cod_barras decimal(18, 0) NULL,
	cod_pesable decimal(18, 0) NULL,
	cod_inpesable decimal(18, 0) NULL,
 CONSTRAINT key5 PRIMARY KEY 
(
	id_gencode 
) 
);
/* SQLINES DEMO *** le [dbo].[inventario_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.inventario_articulo(
	cod_barras varchar(15) NOT NULL,
	fecha_inicial_inv Timestamp(3) NOT NULL,
	fecha_ultima_act Timestamp(3) NOT NULL,
	inventario_ini decimal(19, 3) NOT NULL,
	entradas decimal(19, 3) NOT NULL,
	compras decimal(19, 3) NOT NULL,
	salidas decimal(19, 3) NOT NULL,
	ventas decimal(19, 3) NOT NULL,
	stock_actual decimal(19, 3) NOT NULL,
 CONSTRAINT key23 PRIMARY KEY 
(
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[inventario_captura]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.inventario_captura(
	id_captura Char(36) NOT NULL,
	id_inventario_fisico Char(36) NOT NULL,
	num_captura bigint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	fecha_captura Timestamp(3) NOT NULL,
	cant_cja decimal(19, 3) NOT NULL,
	cant_pza decimal(19, 3) NOT NULL,
	upload Boolean NOT NULL,
 CONSTRAINT pk_inventario_captura PRIMARY KEY 
(
	id_captura,
	id_inventario_fisico,
	num_captura 
) 
);
/* SQLINES DEMO *** le [dbo].[inventario_fisico]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.inventario_fisico(
	id_inventario_fisico Char(36) NOT NULL,
	id_proveedor Char(36) NOT NULL,
	user_name varchar(15) NOT NULL,
	fecha_ini Timestamp(3) NOT NULL,
	fecha_fin Timestamp(3) NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key13 PRIMARY KEY 
(
	id_inventario_fisico 
) 
);
/* SQLINES DEMO *** le [dbo].[inventario_fisico_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.inventario_fisico_articulo(
	cod_barras varchar(15) NOT NULL,
	id_inventario_fisico Char(36) NOT NULL,
	stock_estimado decimal(19, 3) NOT NULL,
	stock_fisico decimal(19, 3) NOT NULL,
 CONSTRAINT key14 PRIMARY KEY 
(
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[kit_articulos]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.kit_articulos(
	cod_barras_kit varchar(15) NOT NULL,
	cod_barras_pro varchar(15) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
 CONSTRAINT pk_articulo_asociado PRIMARY KEY 
(
	cod_barras_kit,
	cod_barras_pro 
) 
);
/* SQLINES DEMO *** le [dbo].[Logs]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.Logs(
	Id int GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
	EventDateTime Timestamp(3) NOT NULL,
	EventLevel Varchar(100) NOT NULL,
	UserName Varchar(100) NOT NULL,
	MachineName Varchar(100) NOT NULL,
	EventMessage Text NOT NULL,
	ErrorSource Varchar(100) NULL,
	ErrorClass Varchar(500) NULL,
	ErrorMethod Text NULL,
	ErrorMessage Text NULL,
	InnerErrorMessage Text NULL,
 CONSTRAINT PK_Logs PRIMARY KEY 
(
	Id 
) 
);
/* SQLINES DEMO *** le [dbo].[mes]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.mes(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[metodo_pago]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.metodo_pago(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[moneda]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.moneda(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	decimales varchar(3) NOT NULL,
	porcentaje varchar(6) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[movimiento_almacen]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.movimiento_almacen(
	id_movto bigint GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
	descripcion varchar(50) NOT NULL,
	tipo_movto varchar(15) NOT NULL,
 CONSTRAINT key7 PRIMARY KEY 
(
	id_movto 
) 
);
/* SQLINES DEMO *** le [dbo].[municipio]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.municipio(
	id_entidad smallint NOT NULL,
	id_municipio smallint NOT NULL,
	nombre varchar(100) NOT NULL,
 CONSTRAINT pk_municipio PRIMARY KEY 
(
	id_municipio,
	id_entidad 
) 
);
/* SQLINES DEMO *** le [dbo].[oferta]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.oferta(
	id_oferta Char(36) NOT NULL,
	num_oferta bigint NOT NULL,
	descripcion varchar(80) NOT NULL,
	fecha_oferta Timestamp(3) NOT NULL,
	fecha_ini Timestamp(3) NOT NULL,
	fecha_fin Timestamp(3) NOT NULL,
	status_oferta varchar(20) NOT NULL,
	fecha_cancelacion Timestamp(3) NULL,
	user_name varchar(15) NULL,
 CONSTRAINT key11 PRIMARY KEY 
(
	id_oferta 
) 
);
/* SQLINES DEMO *** le [dbo].[oferta_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.oferta_articulo(
	id_oferta Char(36) NOT NULL,
	cod_barras varchar(15) NOT NULL,
	precio_oferta decimal(19, 3) NOT NULL,
	status_oferta varchar(20) NOT NULL,
	fecha_cancelacion Timestamp(3) NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key12 PRIMARY KEY 
(
	id_oferta,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[orden]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.orden(
	id_pedido Char(36) NOT NULL,
	num_pedido bigint NOT NULL,
	fecha_pedido Timestamp(3) NOT NULL,
	id_proveedor Char(36) NOT NULL,
	status_pedido varchar(20) NOT NULL,
	no_dias smallint NOT NULL,
	fecha_autorizado Timestamp(3) NULL,
	plan varchar(15) NOT NULL,
	anio smallint NOT NULL,
	mes smallint NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key26 PRIMARY KEY 
(
	id_pedido 
) 
);
/* SQLINES DEMO *** le [dbo].[orden_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.orden_articulo(
	id_pedido Char(36) NOT NULL,
	no_articulo smallint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cod_anexo varchar(15) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
	precio_articulo decimal(19, 3) NOT NULL,
	por_surtir decimal(19, 3) NOT NULL,
	por_surtir_pzas decimal(19, 3) NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT key27 PRIMARY KEY 
(
	no_articulo,
	id_pedido 
) 
);
/* SQLINES DEMO *** le [dbo].[pais]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pais(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	agrupacion varchar(60) NOT NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[pedido]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pedido(
	id_pedido Char(36) NOT NULL,
	num_pedido bigint NOT NULL,
	fecha_pedido Timestamp(3) NOT NULL,
	id_proveedor Char(36) NOT NULL,
	status_pedido varchar(20) NOT NULL,
	no_dias smallint NOT NULL,
	fecha_autorizado Timestamp(3) NULL,
	plan varchar(15) NOT NULL,
	anio smallint NOT NULL,
	mes smallint NOT NULL,
 CONSTRAINT pk_pedido PRIMARY KEY 
(
	id_pedido 
) 
);
/* SQLINES DEMO *** le [dbo].[pedido_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pedido_articulo(
	id_pedido Char(36) NOT NULL,
	no_articulo smallint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cod_anexo varchar(15) NOT NULL,
	cant_original decimal(19, 3) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
	precio_articulo decimal(19, 3) NOT NULL,
	sugerido decimal(19, 3) NOT NULL,
 CONSTRAINT pk_pedido_articulo PRIMARY KEY 
(
	id_pedido,
	no_articulo 
) 
);
/* SQLINES DEMO *** le [dbo].[periodicidad]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.periodicidad(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[permiso]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.permiso(
	id_permiso varchar(15) NOT NULL,
	descripcion varchar(50) NOT NULL,
	tipo_sistema varchar(50) NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT pk_permiso PRIMARY KEY 
(
	id_permiso 
) 
);
/* SQLINES DEMO *** le [dbo].[pos]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pos(
	id_pos smallint NOT NULL,
	pos_address varchar(30) NOT NULL,
	user_sql varchar(30) NOT NULL,
	pwsd_sql varchar(50) NOT NULL,
 CONSTRAINT pk_pos PRIMARY KEY 
(
	id_pos 
) 
);
/* SQLINES DEMO *** le [dbo].[pos_admin_settings]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pos_admin_settings(
	id_setting Char(36) NOT NULL,
	path_ptr_label varchar(80) NULL,
	path_dir_bascula varchar(80) NULL,
	cod_normal bigint NOT NULL,
	cod_pesable bigint NOT NULL,
	cod_nopesable bigint NOT NULL,
	iva decimal(5, 3) NOT NULL,
	cfdi_user varchar(100) NULL,
	cfdi_pwsd varchar(100) NULL,
	cfdi_path_txt varchar(150) NULL,
	cfdi_path_pdf varchar(150) NULL,
 CONSTRAINT key20 PRIMARY KEY 
(
	id_setting 
) 
);
/* SQLINES DEMO *** le [dbo].[pos_control]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.pos_control(
	id_control_pos Char(36) NOT NULL,
	id_pos int NOT NULL,
	user_name varchar(15) NOT NULL,
	pos_open_date Timestamp(3) NOT NULL,
 CONSTRAINT key30 PRIMARY KEY 
(
	id_control_pos 
) 
);
/* SQLINES DEMO *** le [dbo].[precio_temporal]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.precio_temporal(
	cod_barras varchar(15) NOT NULL,
	precio_compra decimal(19, 3) NOT NULL,
	utilidad decimal(5, 3) NOT NULL,
	precio_venta decimal(19, 3) NOT NULL,
	iva decimal(4, 2) NOT NULL,
 CONSTRAINT key4 PRIMARY KEY 
(
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[productos_sin_iva]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.productos_sin_iva(
	cod_barras varchar(15) NOT NULL,
	descripcion varchar(80) NOT NULL
);
/* SQLINES DEMO *** le [dbo].[promocion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.promocion(
	id_promo Char(36) NOT NULL,
	descripcion varchar(100) NOT NULL,
	tipo_promo char(3) NOT NULL,
	fecha_ini Timestamp(3) NOT NULL,
	fecha_fin Timestamp(3) NOT NULL,
 CONSTRAINT key32 PRIMARY KEY 
(
	id_promo 
) 
);
/* SQLINES DEMO *** le [dbo].[promocion_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.promocion_articulo(
	id_promo Char(36) NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cantidad_lleva decimal(19, 3) NOT NULL,
	cantidad_paga decimal(19, 3) NOT NULL,
	porcent_desc decimal(4, 3) NOT NULL,
 CONSTRAINT key33 PRIMARY KEY 
(
	id_promo,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[proveedor]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.proveedor(
	id_proveedor Char(36) NOT NULL,
	rfc varchar(18) NOT NULL,
	razon_social varchar(80) NOT NULL,
	nombre_contacto varchar(100) NULL,
	tel_principal varchar(20) NULL,
	tel_movil varchar(30) NULL,
	e_mail varchar(80) NULL,
	estatus varchar(15) NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT pk_proveedor PRIMARY KEY 
(
	id_proveedor 
) 
);
/* SQLINES DEMO *** le [dbo].[regimen_fiscal]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.regimen_fiscal(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	persona_fisica varchar(10) NOT NULL,
	persona_moral varchar(10) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[salida]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.salida(
	id_salida Char(36) NOT NULL,
	num_salida bigint NOT NULL,
	fecha_salida Timestamp(3) NOT NULL,
	observacion text NULL,
	id_movto bigint NULL,
	user_name varchar(15) NULL,
	cancelada Boolean NOT NULL,
	fecha_cancelacion Timestamp(3) NULL,
 CONSTRAINT key9 PRIMARY KEY 
(
	id_salida 
) 
);
/* SQLINES DEMO *** le [dbo].[salida_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.salida_articulo(
	id_salida Char(36) NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cant_sal decimal(19, 3) NOT NULL,
	cant_pza decimal(19, 3) NOT NULL,
	cant_reg decimal(19, 3) NOT NULL,
	costo decimal(19, 3) NOT NULL,
 CONSTRAINT key10 PRIMARY KEY 
(
	id_salida,
	cod_barras 
) 
);
/* SQLINES DEMO *** le [dbo].[tipo_comprobante]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.tipo_comprobante(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[tipo_relacion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.tipo_relacion(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[unidad_medida]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.unidad_medida(
	id_unidad Char(36) NOT NULL,
	descripcion varchar(10) NOT NULL,
	fecha_registro Timestamp(3) NOT NULL,
	cve_sat varchar(5) NOT NULL,
 CONSTRAINT pk_unidad_medida PRIMARY KEY 
(
	id_unidad 
) 
);
/* SQLINES DEMO *** le [dbo].[uso_cfdi]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.uso_cfdi(
	id varchar(5) NOT NULL,
	descripcion varchar(120) NOT NULL,
	persona_fisica varchar(10) NOT NULL,
	persona_moral varchar(10) NOT NULL,
	regimen_fiscal_receptor varchar(252) NULL,
	fecha_inicio date NULL,
	fecha_fin date NULL,
PRIMARY KEY 
(
	id 
) 
);
/* SQLINES DEMO *** le [dbo].[usuario]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.usuario(
	user_name varchar(15) NOT NULL,
	password varchar(50) NOT NULL,
	tipo_usuario varchar(30) NOT NULL,
	enable Boolean NOT NULL,
	user_code_bascula smallint NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT pk_usuario PRIMARY KEY 
(
	user_name 
) 
);
/* SQLINES DEMO *** le [dbo].[usuario_permiso]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.usuario_permiso(
	user_name varchar(15) NOT NULL,
	id_permiso varchar(15) NOT NULL,
	valor_num decimal(18, 3) NULL,
	fecha_registro Timestamp(3) NOT NULL,
 CONSTRAINT pk_usuario_permiso PRIMARY KEY 
(
	user_name,
	id_permiso 
) 
);
/* SQLINES DEMO *** le [dbo].[venta]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta(
	id_pos int NOT NULL,
	id_venta Char(36) NOT NULL,
	vendedor varchar(15) NOT NULL,
	folio bigint NOT NULL,
	fecha_venta Timestamp(3) NOT NULL,
	total_vendido decimal(19, 3) NOT NULL,
	pago_efectivo decimal(19, 2) NOT NULL,
	pago_cheque decimal(19, 3) NOT NULL,
	pago_vales decimal(19, 2) NOT NULL,
	pago_tc decimal(19, 2) NOT NULL,
	supervisor varchar(15) NULL,
	upload Boolean NOT NULL,
	num_registros smallint NOT NULL,
 CONSTRAINT pk_venta PRIMARY KEY 
(
	id_venta,
	id_pos 
) 
);
/* SQLINES DEMO *** le [dbo].[venta_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta_articulo(
	id_pos int NOT NULL,
	id_venta Char(36) NOT NULL,
	no_articulo bigint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	user_code_bascula smallint NULL,
	cantidad decimal(19, 3) NOT NULL,
	articulo_ofertado Boolean NOT NULL,
	precio_regular decimal(19, 3) NOT NULL,
	cambio_precio Boolean NOT NULL,
	iva decimal(4, 3) NOT NULL,
	precio_vta decimal(19, 3) NOT NULL,
	porcent_desc decimal(4, 2) NOT NULL,
	cant_devuelta decimal(19, 3) NOT NULL,
	user_name varchar(15) NULL,
	id_promo Char(36) NULL,
	no_promo_aplicado smallint NULL,
 CONSTRAINT pk_venta_articulo PRIMARY KEY 
(
	no_articulo,
	id_pos,
	id_venta 
) 
);
/* SQLINES DEMO *** le [dbo].[venta_cancelada]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta_cancelada(
	id_pos int NOT NULL,
	id_venta_cancel Char(36) NOT NULL,
	vendedor varchar(15) NOT NULL,
	fecha Timestamp(3) NOT NULL,
	total_vendido decimal(19, 3) NOT NULL,
	pago_efectivo decimal(19, 2) NOT NULL,
	pago_cheque decimal(19, 2) NOT NULL,
	pago_vales decimal(19, 2) NOT NULL,
	pago_tc decimal(19, 2) NOT NULL,
	status varchar(15) NOT NULL,
	supervisor varchar(15) NULL,
	upload Boolean NOT NULL,
 CONSTRAINT key15 PRIMARY KEY 
(
	id_venta_cancel,
	id_pos 
) 
);
/* SQLINES DEMO *** le [dbo].[venta_cancelada_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta_cancelada_articulo(
	id_pos int NOT NULL,
	id_venta_cancel Char(36) NOT NULL,
	no_articulo bigint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
	articulo_ofertado Boolean NOT NULL,
	precio_regular decimal(19, 3) NOT NULL,
	cambio_precio Boolean NOT NULL,
	precio_vta decimal(19, 3) NOT NULL,
	porcent_desc decimal(19, 3) NOT NULL,
	user_name varchar(15) NULL,
 CONSTRAINT key16 PRIMARY KEY 
(
	id_venta_cancel,
	id_pos,
	no_articulo 
) 
);
/* SQLINES DEMO *** le [dbo].[venta_devolucion]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta_devolucion(
	id_devolucion Char(36) NOT NULL,
	folio bigint NOT NULL,
	id_pos int NOT NULL,
	id_venta Char(36) NOT NULL,
	fecha_dev Timestamp(3) NOT NULL,
	vendedor varchar(15) NOT NULL,
	supervisor varchar(15) NOT NULL,
	cant_dev decimal(19, 3) NOT NULL,
	upload Boolean NOT NULL,
 CONSTRAINT key18 PRIMARY KEY 
(
	id_devolucion 
) 
);
/* SQLINES DEMO *** le [dbo].[venta_devolucion_articulo]    Script Date: 05/10/22 21:00:29 ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE pos_admin.venta_devolucion_articulo(
	id_devolucion Char(36) NOT NULL,
	no_articulo bigint NOT NULL,
	cod_barras varchar(15) NOT NULL,
	cantidad decimal(19, 3) NOT NULL,
 CONSTRAINT key29 PRIMARY KEY 
(
	id_devolucion,
	cod_barras,
	no_articulo 
) 
);
ALTER TABLE pos_admin.articulo ALTER COLUMN cantidad_um  SET DEFAULT ((1)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN precio_compra  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.articulo ALTER COLUMN precio_venta  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN tipo_articulo  SET DEFAULT ('principal');
 
ALTER TABLE pos_admin.articulo ALTER COLUMN stock  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN iva  SET DEFAULT ((0.16)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN articulo_disponible  SET DEFAULT ((1)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN kit  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN visible  SET DEFAULT ((1));
 
ALTER TABLE pos_admin.articulo ALTER COLUMN puntos  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN last_update_inventory  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.articulo ALTER COLUMN cve_producto  SET DEFAULT ('0') ;
 
ALTER TABLE pos_admin.articulos ALTER COLUMN cantidad_um  SET DEFAULT ((1)) ;
 
ALTER TABLE pos_admin.compra ALTER COLUMN cancelada  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.compra_articulo ALTER COLUMN cant_cja  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.compra_articulo ALTER COLUMN cant_pza  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.control_errores ALTER COLUMN id_error  SET DEFAULT (newid()) ;
 
ALTER TABLE pos_admin.ctrl_errores ALTER COLUMN fecha_log  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.direccion_proveedor ALTER COLUMN pais  SET DEFAULT ('méxico') ;
 
ALTER TABLE pos_admin.empleado ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.empresa ALTER COLUMN pais  SET DEFAULT ('méxico') ;
 
ALTER TABLE pos_admin.empresa ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.entrada ALTER COLUMN cancelada  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.entrada_articulo ALTER COLUMN cant_ent  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.entrada_articulo ALTER COLUMN cant_pza  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.entrada_articulo ALTER COLUMN cant_reg  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.entrada_articulo ALTER COLUMN costo  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN ene  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN feb  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN mar  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN abr  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN may  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN jun  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN jul  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN ago  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN sep  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN oct  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN nov  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.estadistica ALTER COLUMN dic  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.factura_articulo ALTER COLUMN iva  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.factura_articulo ALTER COLUMN precio_vta  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.factura_venta ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN inventario_ini  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN entradas  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN compras  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN salidas  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN ventas  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_articulo ALTER COLUMN stock_actual  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN id_captura  SET DEFAULT (newid()) ;
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN id_inventario_fisico  SET DEFAULT (newid()) ;
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN fecha_captura  SET DEFAULT (now());
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN cant_cja  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN cant_pza  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_captura ALTER COLUMN upload  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.inventario_fisico ALTER COLUMN id_inventario_fisico  SET DEFAULT (newid()) ;
 
ALTER TABLE pos_admin.inventario_fisico ALTER COLUMN fecha_ini  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.inventario_fisico ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.inventario_fisico_articulo ALTER COLUMN id_inventario_fisico  SET DEFAULT (newid()) ;
 
ALTER TABLE pos_admin.inventario_fisico_articulo ALTER COLUMN stock_estimado  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.inventario_fisico_articulo ALTER COLUMN stock_fisico  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.oferta ALTER COLUMN fecha_oferta  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.oferta_articulo ALTER COLUMN precio_oferta  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.oferta_articulo ALTER COLUMN status_oferta  SET DEFAULT ('disponible');
 
ALTER TABLE pos_admin.oferta_articulo ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.orden ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.orden_articulo ALTER COLUMN por_surtir_pzas  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.orden_articulo ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.pedido ALTER COLUMN status_pedido  SET DEFAULT ('pendiente');
 
ALTER TABLE pos_admin.pedido ALTER COLUMN no_dias  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.pedido_articulo ALTER COLUMN cant_original  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.pedido_articulo ALTER COLUMN sugerido  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.permiso ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.pos_admin_settings ALTER COLUMN iva  SET DEFAULT ((0.000)) ;
 
ALTER TABLE pos_admin.pos_control ALTER COLUMN pos_open_date  SET DEFAULT (now());
 
ALTER TABLE pos_admin.precio_temporal ALTER COLUMN precio_compra  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.precio_temporal ALTER COLUMN utilidad  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.precio_temporal ALTER COLUMN precio_venta  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.precio_temporal ALTER COLUMN iva  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.promocion_articulo ALTER COLUMN cantidad_lleva  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.promocion_articulo ALTER COLUMN cantidad_paga  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.promocion_articulo ALTER COLUMN porcent_desc  SET DEFAULT ((0.000)) ;
 
ALTER TABLE pos_admin.proveedor ALTER COLUMN estatus  SET DEFAULT ('activo');
 
ALTER TABLE pos_admin.proveedor ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.salida ALTER COLUMN cancelada  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.salida_articulo ALTER COLUMN cant_sal  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.salida_articulo ALTER COLUMN cant_pza  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.salida_articulo ALTER COLUMN cant_reg  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.salida_articulo ALTER COLUMN costo  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.unidad_medida ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.unidad_medida ALTER COLUMN cve_sat  SET DEFAULT ('0');
 
ALTER TABLE pos_admin.usuario ALTER COLUMN enable  SET DEFAULT ((1)) ;
 
ALTER TABLE pos_admin.usuario ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.usuario_permiso ALTER COLUMN fecha_registro  SET DEFAULT (now()) ;
 
ALTER TABLE pos_admin.venta ALTER COLUMN total_vendido  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.venta ALTER COLUMN pago_efectivo  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.venta ALTER COLUMN pago_cheque  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.venta ALTER COLUMN pago_vales  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.venta ALTER COLUMN pago_tc  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.venta ALTER COLUMN upload  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta ALTER COLUMN num_registros  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN articulo_ofertado  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN precio_regular  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN cambio_precio  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN iva  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN porcent_desc  SET DEFAULT ((0.0)) ;
 
ALTER TABLE pos_admin.venta_articulo ALTER COLUMN cant_devuelta  SET DEFAULT ((0.0));
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN total_vendido  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN pago_efectivo  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN pago_cheque  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN pago_vales  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN pago_tc  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_cancelada ALTER COLUMN upload  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN cantidad  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN articulo_ofertado  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN precio_regular  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN cambio_precio  SET DEFAULT ((0));
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN precio_vta  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_cancelada_articulo ALTER COLUMN porcent_desc  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_devolucion ALTER COLUMN cant_dev  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_devolucion ALTER COLUMN upload  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.venta_devolucion_articulo ALTER COLUMN cantidad  SET DEFAULT ((0)) ;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT fk_articulo_articulo FOREIGN KEY(cod_asociado)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT fk_articulo_articulo;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT fk_clasificacion_articulo FOREIGN KEY(id_clasificacion)
REFERENCES pos_admin.clasificacion (id_clasificacion);
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT fk_clasificacion_articulo;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT fk_proveedor_articulo FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT fk_proveedor_articulo;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT fk_unidad_articulo FOREIGN KEY(id_unidad)
REFERENCES pos_admin.unidad_medida (id_unidad);
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT fk_unidad_articulo;
 
ALTER TABLE pos_admin.articulos  ADD  CONSTRAINT fk_articulo_articulos FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.articulos VALIDATE CONSTRAINT fk_articulo_articulos;
 
ALTER TABLE pos_admin.articulos  ADD  CONSTRAINT fk_proveedor_articulos FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.articulos VALIDATE CONSTRAINT fk_proveedor_articulos;
 
ALTER TABLE pos_admin.articulos  ADD  CONSTRAINT fk_unidad_articulos FOREIGN KEY(id_unidad)
REFERENCES pos_admin.unidad_medida (id_unidad);
 
ALTER TABLE pos_admin.articulos VALIDATE CONSTRAINT fk_unidad_articulos;
 
ALTER TABLE pos_admin.clasificacion  ADD  CONSTRAINT fk_clasificacion_subclasificacion FOREIGN KEY(id_clasificacion_dep)
REFERENCES pos_admin.clasificacion (id_clasificacion);
 
ALTER TABLE pos_admin.clasificacion VALIDATE CONSTRAINT fk_clasificacion_subclasificacion;
 
ALTER TABLE pos_admin.compra  ADD  CONSTRAINT fk_pedido_compra FOREIGN KEY(id_pedido)
REFERENCES pos_admin.pedido (id_pedido);
 
ALTER TABLE pos_admin.compra VALIDATE CONSTRAINT fk_pedido_compra;
 
ALTER TABLE pos_admin.compra  ADD  CONSTRAINT fk_proveedor_compra FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.compra VALIDATE CONSTRAINT fk_proveedor_compra;
 
ALTER TABLE pos_admin.compra_articulo  ADD  CONSTRAINT fk_articulo_compra FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.compra_articulo VALIDATE CONSTRAINT fk_articulo_compra;
 
ALTER TABLE pos_admin.compra_articulo  ADD  CONSTRAINT fk_compra_articulo FOREIGN KEY(id_compra)
REFERENCES pos_admin.compra (id_compra);
 
ALTER TABLE pos_admin.compra_articulo VALIDATE CONSTRAINT fk_compra_articulo;
 
ALTER TABLE pos_admin.direccion  ADD  CONSTRAINT FK_direccion_cliente FOREIGN KEY(id_cliente)
REFERENCES pos_admin.cliente (id_cliente);
 
ALTER TABLE pos_admin.direccion VALIDATE CONSTRAINT FK_direccion_cliente;
 
ALTER TABLE pos_admin.direccion  ADD  CONSTRAINT FK_direccion_entidad FOREIGN KEY(id_entidad)
REFERENCES pos_admin.entidad (id_entidad);
 
ALTER TABLE pos_admin.direccion VALIDATE CONSTRAINT FK_direccion_entidad;
 
ALTER TABLE pos_admin.direccion  ADD  CONSTRAINT FK_direccion_municipio FOREIGN KEY(id_municipio, id_entidad)
REFERENCES pos_admin.municipio (id_municipio, id_entidad);
 
ALTER TABLE pos_admin.direccion VALIDATE CONSTRAINT FK_direccion_municipio;
 
ALTER TABLE pos_admin.direccion_proveedor  ADD  CONSTRAINT fk_municipio_direccion FOREIGN KEY(id_municipio, id_entidad)
REFERENCES pos_admin.municipio (id_municipio, id_entidad);
 
ALTER TABLE pos_admin.direccion_proveedor VALIDATE CONSTRAINT fk_municipio_direccion;
 
ALTER TABLE pos_admin.direccion_proveedor  ADD  CONSTRAINT fk_proveedor_direccion FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.direccion_proveedor VALIDATE CONSTRAINT fk_proveedor_direccion;
 
ALTER TABLE pos_admin.empleado  ADD  CONSTRAINT fk_usuario_empleado FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.empleado VALIDATE CONSTRAINT fk_usuario_empleado;
 
ALTER TABLE pos_admin.entrada  ADD  CONSTRAINT fk_movimiento_entrada FOREIGN KEY(id_movto)
REFERENCES pos_admin.movimiento_almacen (id_movto);
 
ALTER TABLE pos_admin.entrada VALIDATE CONSTRAINT fk_movimiento_entrada;
 
ALTER TABLE pos_admin.entrada  ADD  CONSTRAINT fk_usuario_entrada FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.entrada VALIDATE CONSTRAINT fk_usuario_entrada;
 
ALTER TABLE pos_admin.entrada_articulo  ADD  CONSTRAINT fk_articulo_entrada FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.entrada_articulo VALIDATE CONSTRAINT fk_articulo_entrada;
 
ALTER TABLE pos_admin.entrada_articulo  ADD  CONSTRAINT fk_entrada_articulo FOREIGN KEY(id_entrada)
REFERENCES pos_admin.entrada (id_entrada);
 
ALTER TABLE pos_admin.entrada_articulo VALIDATE CONSTRAINT fk_entrada_articulo;
 
ALTER TABLE pos_admin.estadistica  ADD  CONSTRAINT fk_articulo_estadistica FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.estadistica VALIDATE CONSTRAINT fk_articulo_estadistica;
 
ALTER TABLE pos_admin.factura  ADD  CONSTRAINT fk_cliente_factura FOREIGN KEY(id_cliente)
REFERENCES pos_admin.cliente (id_cliente);
 
ALTER TABLE pos_admin.factura VALIDATE CONSTRAINT fk_cliente_factura;
 
ALTER TABLE pos_admin.factura  ADD  CONSTRAINT FK_factura_estatus FOREIGN KEY(id_estatus)
REFERENCES pos_admin.estatus (id_estatus);
 
ALTER TABLE pos_admin.factura VALIDATE CONSTRAINT FK_factura_estatus;
 
ALTER TABLE pos_admin.factura_articulo  ADD  CONSTRAINT fk_factura_articulo FOREIGN KEY(id_factura)
REFERENCES pos_admin.factura (id_factura);
 
ALTER TABLE pos_admin.factura_articulo VALIDATE CONSTRAINT fk_factura_articulo;
 
ALTER TABLE pos_admin.factura_articulo  ADD  CONSTRAINT fk_factura_unidad FOREIGN KEY(id_unidad)
REFERENCES pos_admin.unidad_medida (id_unidad);
 
ALTER TABLE pos_admin.factura_articulo VALIDATE CONSTRAINT fk_factura_unidad;
 
ALTER TABLE pos_admin.factura_venta  ADD  CONSTRAINT fk_factura_venta FOREIGN KEY(id_factura)
REFERENCES pos_admin.factura (id_factura);
 
ALTER TABLE pos_admin.factura_venta VALIDATE CONSTRAINT fk_factura_venta;
 
ALTER TABLE pos_admin.factura_venta  ADD  CONSTRAINT fk_venta_factura FOREIGN KEY(id_venta, id_pos)
REFERENCES pos_admin.venta (id_venta, id_pos);
 
ALTER TABLE pos_admin.factura_venta VALIDATE CONSTRAINT fk_venta_factura;
 
ALTER TABLE pos_admin.inventario_articulo  ADD  CONSTRAINT fk_inventario_articulo FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.inventario_articulo VALIDATE CONSTRAINT fk_inventario_articulo;
 
ALTER TABLE pos_admin.inventario_captura  ADD  CONSTRAINT fk_articulo_captura FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.inventario_captura VALIDATE CONSTRAINT fk_articulo_captura;
 
ALTER TABLE pos_admin.inventario_captura  ADD  CONSTRAINT fk_inventario_captura FOREIGN KEY(id_inventario_fisico)
REFERENCES pos_admin.inventario_fisico (id_inventario_fisico);
 
ALTER TABLE pos_admin.inventario_captura VALIDATE CONSTRAINT fk_inventario_captura;
 
ALTER TABLE pos_admin.inventario_fisico  ADD  CONSTRAINT fk_proveedor_inventario_fisico FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.inventario_fisico VALIDATE CONSTRAINT fk_proveedor_inventario_fisico;
 
ALTER TABLE pos_admin.inventario_fisico  ADD  CONSTRAINT fk_usuario_inventario FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.inventario_fisico VALIDATE CONSTRAINT fk_usuario_inventario;
 
ALTER TABLE pos_admin.inventario_fisico_articulo  ADD  CONSTRAINT fk_articulo_inventario_fisico FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.inventario_fisico_articulo VALIDATE CONSTRAINT fk_articulo_inventario_fisico;
 
ALTER TABLE pos_admin.inventario_fisico_articulo  ADD  CONSTRAINT fk_inventario_fisico_articulo FOREIGN KEY(id_inventario_fisico)
REFERENCES pos_admin.inventario_fisico (id_inventario_fisico);
 
ALTER TABLE pos_admin.inventario_fisico_articulo VALIDATE CONSTRAINT fk_inventario_fisico_articulo;
 
ALTER TABLE pos_admin.kit_articulos  ADD  CONSTRAINT fk_articulo_kit FOREIGN KEY(cod_barras_kit)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.kit_articulos VALIDATE CONSTRAINT fk_articulo_kit;
 
ALTER TABLE pos_admin.kit_articulos  ADD  CONSTRAINT fk_articulos_kit FOREIGN KEY(cod_barras_pro)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.kit_articulos VALIDATE CONSTRAINT fk_articulos_kit;
 
ALTER TABLE pos_admin.municipio  ADD  CONSTRAINT fk_entidad_municipio FOREIGN KEY(id_entidad)
REFERENCES pos_admin.entidad (id_entidad);
 
ALTER TABLE pos_admin.municipio VALIDATE CONSTRAINT fk_entidad_municipio;
 
ALTER TABLE pos_admin.oferta  ADD  CONSTRAINT fk_usuario_oferta FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.oferta VALIDATE CONSTRAINT fk_usuario_oferta;
 
ALTER TABLE pos_admin.oferta_articulo  ADD  CONSTRAINT fk_articulo_oferta FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.oferta_articulo VALIDATE CONSTRAINT fk_articulo_oferta;
 
ALTER TABLE pos_admin.oferta_articulo  ADD  CONSTRAINT fk_oferta_articulo FOREIGN KEY(id_oferta)
REFERENCES pos_admin.oferta (id_oferta);
 
ALTER TABLE pos_admin.oferta_articulo VALIDATE CONSTRAINT fk_oferta_articulo;
 
ALTER TABLE pos_admin.orden  ADD  CONSTRAINT fk_order_proveedor FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.orden VALIDATE CONSTRAINT fk_order_proveedor;
 
ALTER TABLE pos_admin.orden_articulo  ADD  CONSTRAINT fk_orden_articulo FOREIGN KEY(id_pedido)
REFERENCES pos_admin.orden (id_pedido);
 
ALTER TABLE pos_admin.orden_articulo VALIDATE CONSTRAINT fk_orden_articulo;
 
ALTER TABLE pos_admin.orden_articulo  ADD  CONSTRAINT fk_orden_articulo_anexo FOREIGN KEY(cod_anexo)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.orden_articulo VALIDATE CONSTRAINT fk_orden_articulo_anexo;
 
ALTER TABLE pos_admin.orden_articulo  ADD  CONSTRAINT fk_orden_articulo_principal FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.orden_articulo VALIDATE CONSTRAINT fk_orden_articulo_principal;
 
ALTER TABLE pos_admin.pedido  ADD  CONSTRAINT fk_proveedor_pedido FOREIGN KEY(id_proveedor)
REFERENCES pos_admin.proveedor (id_proveedor);
 
ALTER TABLE pos_admin.pedido VALIDATE CONSTRAINT fk_proveedor_pedido;
 
ALTER TABLE pos_admin.pedido_articulo  ADD  CONSTRAINT fk_articulo_pedido FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.pedido_articulo VALIDATE CONSTRAINT fk_articulo_pedido;
 
ALTER TABLE pos_admin.pedido_articulo  ADD  CONSTRAINT fk_articulo_pedido_anexo FOREIGN KEY(cod_anexo)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.pedido_articulo VALIDATE CONSTRAINT fk_articulo_pedido_anexo;
 
ALTER TABLE pos_admin.pedido_articulo  ADD  CONSTRAINT fk_pedido_articulo FOREIGN KEY(id_pedido)
REFERENCES pos_admin.pedido (id_pedido);
 
ALTER TABLE pos_admin.pedido_articulo VALIDATE CONSTRAINT fk_pedido_articulo;
 
ALTER TABLE pos_admin.pos_control  ADD  CONSTRAINT usuario_pos_control FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.pos_control VALIDATE CONSTRAINT usuario_pos_control;
 
ALTER TABLE pos_admin.precio_temporal  ADD  CONSTRAINT fk_articulo_temporal FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.precio_temporal VALIDATE CONSTRAINT fk_articulo_temporal;
 
ALTER TABLE pos_admin.promocion_articulo  ADD  CONSTRAINT fk_articulo_promocion FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.promocion_articulo VALIDATE CONSTRAINT fk_articulo_promocion;
 
ALTER TABLE pos_admin.promocion_articulo  ADD  CONSTRAINT fk_promocion_articulo FOREIGN KEY(id_promo)
REFERENCES pos_admin.promocion (id_promo);
 
ALTER TABLE pos_admin.promocion_articulo VALIDATE CONSTRAINT fk_promocion_articulo;
 
ALTER TABLE pos_admin.salida  ADD  CONSTRAINT fk_movimiento_salida FOREIGN KEY(id_movto)
REFERENCES pos_admin.movimiento_almacen (id_movto);
 
ALTER TABLE pos_admin.salida VALIDATE CONSTRAINT fk_movimiento_salida;
 
ALTER TABLE pos_admin.salida  ADD  CONSTRAINT fk_usuario_salida FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.salida VALIDATE CONSTRAINT fk_usuario_salida;
 
ALTER TABLE pos_admin.salida_articulo  ADD  CONSTRAINT fk_articulo_salida FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.salida_articulo VALIDATE CONSTRAINT fk_articulo_salida;
 
ALTER TABLE pos_admin.salida_articulo  ADD  CONSTRAINT fk_salida_articulo FOREIGN KEY(id_salida)
REFERENCES pos_admin.salida (id_salida);
 
ALTER TABLE pos_admin.salida_articulo VALIDATE CONSTRAINT fk_salida_articulo;
 
ALTER TABLE pos_admin.usuario_permiso  ADD  CONSTRAINT fk_permiso_usuario FOREIGN KEY(id_permiso)
REFERENCES pos_admin.permiso (id_permiso);
 
ALTER TABLE pos_admin.usuario_permiso VALIDATE CONSTRAINT fk_permiso_usuario;
 
ALTER TABLE pos_admin.usuario_permiso  ADD  CONSTRAINT fk_usuario_permiso FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.usuario_permiso VALIDATE CONSTRAINT fk_usuario_permiso;
 
ALTER TABLE pos_admin.venta  ADD  CONSTRAINT fk_usuario_cancelacion FOREIGN KEY(supervisor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta VALIDATE CONSTRAINT fk_usuario_cancelacion;
 
ALTER TABLE pos_admin.venta  ADD  CONSTRAINT fk_usuario_venta FOREIGN KEY(vendedor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta VALIDATE CONSTRAINT fk_usuario_venta;
 
ALTER TABLE pos_admin.venta_articulo  ADD  CONSTRAINT fk_articulo_venta FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.venta_articulo VALIDATE CONSTRAINT fk_articulo_venta;
 
ALTER TABLE pos_admin.venta_articulo  ADD  CONSTRAINT fk_promocion_venta_articulo FOREIGN KEY(id_promo)
REFERENCES pos_admin.promocion (id_promo);
 
ALTER TABLE pos_admin.venta_articulo VALIDATE CONSTRAINT fk_promocion_venta_articulo;
 
ALTER TABLE pos_admin.venta_articulo  ADD  CONSTRAINT fk_usuario_cambia_precio FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_articulo VALIDATE CONSTRAINT fk_usuario_cambia_precio;
 
ALTER TABLE pos_admin.venta_articulo  ADD  CONSTRAINT fk_venta_articulo FOREIGN KEY(id_venta, id_pos)
REFERENCES pos_admin.venta (id_venta, id_pos);
 
ALTER TABLE pos_admin.venta_articulo VALIDATE CONSTRAINT fk_venta_articulo;
 
ALTER TABLE pos_admin.venta_cancelada  ADD  CONSTRAINT fk_venta_cancelada_supervisor FOREIGN KEY(supervisor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_cancelada VALIDATE CONSTRAINT fk_venta_cancelada_supervisor;
 
ALTER TABLE pos_admin.venta_cancelada  ADD  CONSTRAINT fk_venta_cancelada_vendedor FOREIGN KEY(vendedor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_cancelada VALIDATE CONSTRAINT fk_venta_cancelada_vendedor;
 
ALTER TABLE pos_admin.venta_cancelada_articulo  ADD  CONSTRAINT fk_articulo_venta_cancelada FOREIGN KEY(cod_barras)
REFERENCES pos_admin.articulo (cod_barras);
 
ALTER TABLE pos_admin.venta_cancelada_articulo VALIDATE CONSTRAINT fk_articulo_venta_cancelada;
 
ALTER TABLE pos_admin.venta_cancelada_articulo  ADD  CONSTRAINT fk_venta_cancelada_articulo FOREIGN KEY(id_venta_cancel, id_pos)
REFERENCES pos_admin.venta_cancelada (id_venta_cancel, id_pos)
ON UPDATE CASCADE
ON DELETE CASCADE;
 
ALTER TABLE pos_admin.venta_cancelada_articulo VALIDATE CONSTRAINT fk_venta_cancelada_articulo;
 
ALTER TABLE pos_admin.venta_cancelada_articulo  ADD  CONSTRAINT fk_venta_cancelada_articulo_usuario FOREIGN KEY(user_name)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_cancelada_articulo VALIDATE CONSTRAINT fk_venta_cancelada_articulo_usuario;
 
ALTER TABLE pos_admin.venta_devolucion  ADD  CONSTRAINT fk_usuario_devolucion_supervisor FOREIGN KEY(supervisor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_devolucion VALIDATE CONSTRAINT fk_usuario_devolucion_supervisor;
 
ALTER TABLE pos_admin.venta_devolucion  ADD  CONSTRAINT fk_usuario_devolucion_vendedor FOREIGN KEY(vendedor)
REFERENCES pos_admin.usuario (user_name);
 
ALTER TABLE pos_admin.venta_devolucion VALIDATE CONSTRAINT fk_usuario_devolucion_vendedor;
 
ALTER TABLE pos_admin.venta_devolucion  ADD  CONSTRAINT fk_venta_devolucion FOREIGN KEY(id_venta, id_pos)
REFERENCES pos_admin.venta (id_venta, id_pos);
 
ALTER TABLE pos_admin.venta_devolucion VALIDATE CONSTRAINT fk_venta_devolucion;
 
ALTER TABLE pos_admin.venta_devolucion_articulo  ADD  CONSTRAINT fk_venta_devolucion_articulo FOREIGN KEY(id_devolucion)
REFERENCES pos_admin.venta_devolucion (id_devolucion);
 
ALTER TABLE pos_admin.venta_devolucion_articulo VALIDATE CONSTRAINT fk_venta_devolucion_articulo;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT ck_cod_barras CHECK  ((cod_barras like '[0-9][0-9][0-9][0-9][0-9][0-9]%'));
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT ck_cod_barras;
 
ALTER TABLE pos_admin.articulo  ADD  CONSTRAINT ck_tipo_articulo CHECK  ((tipo_articulo='kit' OR tipo_articulo='anexo' OR tipo_articulo='asociado' OR tipo_articulo='principal'));
 
ALTER TABLE pos_admin.articulo VALIDATE CONSTRAINT ck_tipo_articulo;
 
ALTER TABLE pos_admin.clave_producto_serv  ADD CHECK  ((franja_fronteriza=(1) OR franja_fronteriza=(0)));
 
ALTER TABLE pos_admin.clave_producto_serv  ADD CHECK  ((ieps_trasladado='No' OR ieps_trasladado='Sí' OR ieps_trasladado='Opcional'));
 
ALTER TABLE pos_admin.clave_producto_serv  ADD CHECK  ((trasladado='No' OR trasladado='Sí' OR trasladado='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((bancarizado='No' OR bancarizado='Sí' OR bancarizado='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((cuenta_ordenante='No' OR cuenta_ordenante='Sí' OR cuenta_ordenante='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((cuenta_beneficiario='No' OR cuenta_beneficiario='Sí' OR cuenta_beneficiario='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((num_operacion='No' OR num_operacion='Sí' OR num_operacion='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((rfc_beneficiario='No' OR rfc_beneficiario='Sí' OR rfc_beneficiario='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((rfc_ordenante='No' OR rfc_ordenante='Sí' OR rfc_ordenante='Opcional'));
 
ALTER TABLE pos_admin.forma_pago  ADD CHECK  ((tipo_pago='No' OR tipo_pago='Sí' OR tipo_pago='Opcional'));
 
ALTER TABLE pos_admin.movimiento_almacen  ADD  CONSTRAINT ck_tipo_mvto CHECK  ((tipo_movto='salida' OR tipo_movto='entrada'));
 
ALTER TABLE pos_admin.movimiento_almacen VALIDATE CONSTRAINT ck_tipo_mvto;
 
ALTER TABLE pos_admin.oferta  ADD  CONSTRAINT checkconstrainta1 CHECK  ((status_oferta='cancelada' OR status_oferta='suspendida' OR status_oferta='disponible'));
 
ALTER TABLE pos_admin.oferta VALIDATE CONSTRAINT checkconstrainta1;
 
ALTER TABLE pos_admin.oferta_articulo  ADD  CONSTRAINT ck_status_oferta_articulo CHECK  ((status_oferta='cancelada' OR status_oferta='suspendida' OR status_oferta='disponible'));
 
ALTER TABLE pos_admin.oferta_articulo VALIDATE CONSTRAINT ck_status_oferta_articulo;
 
ALTER TABLE pos_admin.orden  ADD  CONSTRAINT ck_status_order CHECK  ((status_pedido='surtido' OR status_pedido='autorizado'));
 
ALTER TABLE pos_admin.orden VALIDATE CONSTRAINT ck_status_order;
 
ALTER TABLE pos_admin.pedido  ADD  CONSTRAINT ck_status_pedido CHECK  ((status_pedido='autorizado' OR status_pedido='suspendido' OR status_pedido='no autorizado' OR status_pedido='pendiente'));
 
ALTER TABLE pos_admin.pedido VALIDATE CONSTRAINT ck_status_pedido;
 
ALTER TABLE pos_admin.permiso  ADD  CONSTRAINT ck_tipo_sistema CHECK  ((tipo_sistema='pos_colector' OR tipo_sistema='pos_caja' OR tipo_sistema='pos_admin'));
 
ALTER TABLE pos_admin.permiso VALIDATE CONSTRAINT ck_tipo_sistema;
 
ALTER TABLE pos_admin.proveedor  ADD  CONSTRAINT ck_proveedor_status CHECK  ((estatus='moroso' OR estatus='suspendido' OR estatus='baja' OR estatus='activo'));
 
ALTER TABLE pos_admin.proveedor VALIDATE CONSTRAINT ck_proveedor_status;
 
ALTER TABLE pos_admin.regimen_fiscal  ADD CHECK  ((persona_fisica='No' OR persona_fisica='Sí' OR persona_fisica='Opcional'));
 
ALTER TABLE pos_admin.regimen_fiscal  ADD CHECK  ((persona_moral='No' OR persona_moral='Sí' OR persona_moral='Opcional'));
 
ALTER TABLE pos_admin.uso_cfdi  ADD CHECK  ((persona_fisica='No' OR persona_fisica='Sí' OR persona_fisica='Opcional'));
 
ALTER TABLE pos_admin.uso_cfdi  ADD CHECK  ((persona_moral='No' OR persona_moral='Sí' OR persona_moral='Opcional'));
 
ALTER TABLE pos_admin.usuario  ADD  CONSTRAINT ck_tipo_usuario CHECK  ((tipo_usuario='supervisor' OR tipo_usuario='cajero' OR tipo_usuario='administrador'));
 
ALTER TABLE pos_admin.usuario VALIDATE CONSTRAINT ck_tipo_usuario;
 
ALTER TABLE pos_admin.venta_cancelada  ADD  CONSTRAINT ch_status_vta_cancelada CHECK  ((status='suspecancel' OR status='vendida' OR status='cancelada' OR status='suspendida'));
 
ALTER TABLE pos_admin.venta_cancelada VALIDATE CONSTRAINT ch_status_vta_cancelada;