<template>
    <div>
        <navigation-component></navigation-component>
        <div>
            <h1>Usuarios Component</h1>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'UsuariosComponent',
        components: { NavigationComponent }
    }
</script>