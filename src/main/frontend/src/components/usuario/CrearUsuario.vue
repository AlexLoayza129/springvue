<template>
    <div>
        <navigation-component></navigation-component>
        <div style="margin-top: 2rem;">
            <h1 style="text-align:center;">Crear un Usuario</h1>
            <form style="display:flex;flex-direction: column;width: 50%;margin: 0 auto;">
                <input class="input-custom" type="text" name="nombres" id="nombres" v-model="nombres" placeholder="Ingrese el nombres del usuario" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="apellidos" id="apellidos" v-model="apellidos" placeholder="Ingrese los apellidos del usuario" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="correo" id="correo" v-model="correo" placeholder="Ingrese el correo del usuario" style="margin: 16px 0;">
                <input class="input-custom" type="password" name="contrasena" id="contrasena" v-model="contrasena" placeholder="Ingrese la contrasena del usuario" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="telefono" id="telefono" v-model="telefono" placeholder="Ingrese el telefono del usuario" style="margin: 16px 0;">
                <input class="input-custom" type="text" name="direccion" id="direccion" v-model="direccion" placeholder="Ingrese la direccion del usuario" style="margin: 16px 0;">
                <button @click="createUser" type="button" style="padding: 8px 16px;border-radius:8px;background-color: #243589;color: white;">Enviar</button>
            </form>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'UsuarioCrear',
        data(){
            return{
                nombres: '',
                apellidos: '',
                correo: '',
                contrasena: '',
                telefono: '',
                direccion: ''
            }
        },
        components: { NavigationComponent },
        methods:{
            createUser: async function (){
                let user = {
                    'id': null,
                    'nombres': this.nombres,
                    'apellidos': this.apellidos,
                    'correo': this.correo,
                    'contrasena': this.contrasena,
                    'telefono': this.telefono,
                    'direccion': this.direccion
                }
                
                let url = "http://localhost:8082/api/usuarios";

                const response = await fetch(url,{
                    method: 'POST',
                    body: JSON.stringify(user),
                    headers: {
                        'Content-Type': 'application/json'
                    },
                })

                this.$router.push('/usuarios')
            }
        }
    }
</script>