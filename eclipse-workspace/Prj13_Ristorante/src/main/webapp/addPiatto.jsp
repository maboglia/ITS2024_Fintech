
<form action="/Ristorante/piatti" method="post">

	<div>
		<label>Nome piatto</label>
		<input type="text" name="nome">
	</div>

	<div>
		<label>Prezzo</label>
		<input type="number" step="0.01" name="prezzo">
	</div>
	
	<div>
		<label>Categoria</label>
		<select name="categoria">
			<option value="1">Primi</option>
			<option value="2">Secondi</option>
			<option value="3">Dolci</option>
			<option value="4">Bevande</option>
		</select>
	</div>
	
	<div>
		<label>Add</label>
		<input type="submit" value="Add Piatto">
	</div>
</form> 