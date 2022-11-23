<template>
    <div>
        <navigation-component></navigation-component>
        <div>
            <h1>Crear Producto Component</h1>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'ProductoCrear',
        components: { NavigationComponent }
    }
</script>