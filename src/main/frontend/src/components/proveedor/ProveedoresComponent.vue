<template>
    <div>
        <navigation-component></navigation-component>
        <div>
            <div class="card_box">
            <div class="card" v-for="(suplier,index) in data">
                <h2>{{ suplier.nombres }}</h2>
                <h3>Razón Social: {{ suplier.razonSocial }}</h3>
                <p>RUC: {{ suplier.ruc }}</p>
                <p>Telefono: {{ suplier.telefono }}</p>
            </div>
        </div>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'ProveedoresComponent',
        data(){
            return{
                data: {}
            }
        },
        components: { NavigationComponent },
        created(){
            fetch('http://localhost:8082/api/proveedores')
                .then(response => response.json())
                    .then(data => this.data = data )

        }
    }
</script>