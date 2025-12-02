<script>
    export let texto = 'boton';
    export let color = 'yellow';

</script>


    <button style="background-color:{color}">
    {texto}
    </button>

<style>
    
    button{
        color: white;
        background-color: var(--btn-color);
    }
</style>