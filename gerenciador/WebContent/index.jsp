<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador de Empresas Testando Git</title>
</head>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br /> <a href="busca">Listar Empresas</a>
	<br /> Insira uma nova empresa:
	<br />

	<form action="novaEmpresa" method="post">
		<div>
			<label>Nome:</label> <input type="text" name="nome">
		</div>
		<div>
			<button type="submit">Enviar</button>
		</div>
	</form>

	Faça login:
	<br />
	<form action="login" method="post">
		<div>
			<label>Email:</label> <input type="text" name="email">
		</div>
		<div>
			<label>Senha:</label> <input type="password" name="senha">
		</div>
		<div>
			<button type="submit">Login</button>
		</div>
	</form>

	Faça logout:
	<br />
	<form action="logout" method="post">
		<button type="submit">Logout</button>
	</form>
</body>
</html>