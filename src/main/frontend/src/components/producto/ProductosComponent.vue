<template>
    <div>
        <navigation-component></navigation-component>
        <div class="card_box">
            <div class="card" v-for="(product,index) in data">
                <h2>{{ product.nombre }}</h2>
                <h3>Precio unitario: <span>S/{{ product.precioUnitario }}</span></h3>
                <p>{{ product.descripcion }}</p>
                <div class="btn_box">
                    <button class="more_info_btn">Más información</button>
                    <button class="delete_btn">Eliminar</button>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '../layouts/NavigationComponent.vue'
    export default{
        name: "productos",
        data(){
            return{
                data: {}
            }
        },  
        components: { NavigationComponent },
        created(){
            fetch('http://localhost:8082/api/productos')
                .then(response => response.json())
                    .then(data => this.data = data )

        }
    }
</script>