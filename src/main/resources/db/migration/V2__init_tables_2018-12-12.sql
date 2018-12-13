CREATE TABLE interface (
	id int(10) UNSIGNED auto_increment PRIMARY KEY,
	name varchar(255) DEFAULT '',
	url VARCHAR(255) DEFAULT '',
	request_method enum('GET','POST','PUT','DELETE') DEFAULT 'POST',
	description varchar(512) DEFAULT '',
	create_user_id int(10) NOT NULL,
	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_user_id int(10) NOT NULL,
	is_delete TINYINT(1) UNSIGNED DEFAULT 0,
	project_id int(10) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE project (
	id int(10) UNSIGNED auto_increment PRIMARY KEY,
	name VARCHAR(255) DEFAULT '',
	url VARCHAR(255) DEFAULT '',
	description varchar(512) DEFAULT '',
	create_user_id int(10) NOT NULL,
	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_user_id int(10) NOT NULL,
	is_delete TINYINT(1) UNSIGNED DEFAULT 0
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE interface_field (
	id int(10) UNSIGNED auto_increment PRIMARY KEY,
	name VARCHAR(255) DEFAULT '',
	description varchar(512) DEFAULT '',
	default_value varchar(255) DEFAULT '',
	value_type enum('int','long','string','array') DEFAULT 'string',
	interface_id int(10) NOT NULL,
	is_delete TINYINT(1) UNSIGNED DEFAULT 0,
	create_user_id int(10) NOT NULL,
	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	update_user_id int(10) NOT NULL,
	update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	type enum('param','result') NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE user (
	id int(10) UNSIGNED auto_increment PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	password varchar(255) NOT NULL,
	type enum('backgroud_dev','font_dev','visitor','leader') DEFAULT 'visitor',
	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	is_delete TINYINT(1) UNSIGNED DEFAULT 0
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;