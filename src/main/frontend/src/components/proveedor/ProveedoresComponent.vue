<template>
    <div>
        <navigation-component></navigation-component>
        <div>
            <h1>Proveedor Component</h1>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'ProveedoresComponent',
        components: { NavigationComponent }
    }
</script>