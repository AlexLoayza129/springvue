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
                    <button class="delete_product">Eliminar</button>
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
<style scoped>

.card_box{
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    margin: 16px 8px;
}

.card{
    border-top: #f9ae00 8px solid;
    box-shadow: 5px 4px 20px 1px rgba(0,0,0,0.5);
    margin: 8px 16px;
    border-radius: 8px;
    padding: 16px 8px;
}

.card > h2{
    font-weight: bold;
    text-align: center;
}

.card > h3 > span{
    color: rgb(46, 245, 46);
    font-size: 18px;
}

.btn_box{
    width:100%;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 16px auto;
}

.more_info_btn{
    background-color: #22d3ee;
    padding: 4px 8px;
    border-radius: 8px;
    color:white;
    border-bottom: 2px solid #06b6d4;
    margin: 0 4px;
}

.delete_product{
    background-color: #ef4444;
    padding: 4px 8px;
    border-radius: 8px;
    color:white;
    border-bottom: 2px solid #dc2626;
    margin: 0 4px;

}

</style>