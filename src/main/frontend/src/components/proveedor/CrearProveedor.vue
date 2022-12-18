<template>
    <div>
        <navigation-component></navigation-component>
        <div style="margin-top: 2rem;">
            <h1 style="text-align:center;">Crear un Proveedor</h1>
            <form style="display:flex;flex-direction: column;width: 50%;margin: 0 auto;">
                <input class="input-custom" type="text" name="nombres" id="nombres" v-model="nombres" placeholder="Ingrese el nombres del proveedor" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="razonSocial" id="razonSocial" v-model="razonSocial" placeholder="Ingrese la razón social del proveedor" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="ruc" id="ruc" v-model="ruc" placeholder="Ingrese el ruc del proveedor" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="telefono" id="telefono" v-model="telefono" placeholder="Ingrese el telefono del proveedor" style="margin: 16px 0;">
                <button @click="createSuplier" type="button" style="padding: 8px 16px;border-radius:8px;background-color: #243589;color: white;">Enviar</button>
            </form>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';
    import jQuery from 'jquery'
    window.$ = jQuery

    export default {
        name: 'ProveedorCrear',
        data(){
            return{
                nombres: '',
                razonSocial: '',
                ruc: '',
                telefono: '',
            }
        },
        components: { NavigationComponent },
        methods:{
            createSuplier: async function (){
                let suplier = {
                    'id': null,
                    'nombres': this.nombres,
                    'razonSocial': this.razonSocial,
                    'ruc': this.ruc,
                    'telefono': this.telefono
                }
                
                let url = "http://localhost:8082/api/proveedores";

                const response = await fetch(url,{
                    method: 'POST',
                    body: JSON.stringify(suplier),
                    headers: {
                        'Content-Type': 'application/json'
                    },
                })

                this.$router.push('/proveedores')
            }
        }
    }
</script>