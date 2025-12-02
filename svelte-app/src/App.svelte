<script>
	import Hijo from './Hijo.svelte'
	export let name;
	let nombre = 'Visitante'

	let contador =0;
	function incrementar() {
		contador = contador + 1;
	}
	function borrar() {
		contador = contador - contador;
	}
	function Saludar(){
		alert(nombre ? nombre: "no hay nombre")
	}

	function maximopoder(){
		contador = contador + 50
	}
</script>

<main>
	<h1>Contar: {contador}</h1>
	<button on:click={incrementar}>Sumar ++</button>
	<button on:click={borrar}>Borrar</button>
	<button on:click={maximopoder}>MAXIMO PODER</button>
	<input type="text" placeholder="escribe tu nombre" bind:value={nombre}>
	<button on:click={Saludar}>Saludar</button>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>