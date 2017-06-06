<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Cálculo de IMC - MVC</title>

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>

	<div class="container" style="margin-top: 30px">
		<div class="col-md-4">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						<strong>Cálculo de IMC - MVC</strong>
					</h3>
				</div>
				<div class="panel-body">
					<form role="form" name="imcForm" id="imcForm">

						<div class="form-group">
							<label for="altura" class="col-sm-2 control-label">Altura</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="altura">
							</div>
						</div>


						<div class="form-group">
							<label for="peso" class="col-sm-2 control-label">Peso</label>
							<div class="col-sm-10">
								<input type="number" class="form-control" name="peso">
							</div>
						</div>

						<div class="form-group">
							<label for="sexo" class="col-sm-2 control-label">Sexo</label>
							<div class="col-sm-10">
								<select class="form-control" name="sexo">
									<option>Masculino</option>
									<option>Feminino</option>
								</select>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-primary">Calcular</button>
								</div>
							</div>
						</div>
					</form>
				</div>

				<div class="alert alert-success" role="alert"
					style="margin-top: 45px">${situacao}</div>
			</div>
		</div>
	</div>
</body>
</html>