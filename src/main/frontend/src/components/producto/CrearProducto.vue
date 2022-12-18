<template>
    <div>
        <navigation-component></navigation-component>
        <div style="margin-top: 2rem;">
            <h1 style="text-align:center;">Crear un Producto</h1>
            <form style="display:flex;flex-direction: column;width: 50%;margin: 0 auto;">
                <input class="input-custom" type="text" name="nombre" id="nombre" v-model="nombre" placeholder="Ingrese el nombre del producto" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="descripcion" id="descripcion" v-model="descripcion" placeholder="Ingrese la descripción del producto" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="precioUnitario" id="precioUnitario" v-model="precioUnitario" placeholder="Ingrese el precio del producto" style="margin: 16px 0;">
                <button @click="createProduct" type="button" style="padding: 8px 16px;border-radius:8px;background-color: #243589;color: white;">Enviar</button>
            </form>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';
    import jQuery from 'jquery'
    window.$ = jQuery

    export default {
        name: 'ProductoCrear',
        data(){
            return{
                nombre: '',
                descripcion: '',
                precioUnitario: 0
            }
        },
        methods:{
            createProduct: async function (){
                let product = {
                    'id': null,
                    'uid': 'PR-TEST',
                    'proveedorId': 5,
                    'nombre': this.nombre,
                    'descripcion': this.descripcion,
                    'precioUnitario': this.precioUnitario
                }

                
                
                let url = "http://localhost:8082/api/productos";

                const response = await fetch(url,{
                    method: 'POST',
                    body: JSON.stringify(product),
                    headers: {
                        'Content-Type': 'application/json'
                    },
                })

                this.$router.push('/productos')
            }
        },
        components: { NavigationComponent }
    }
</script>