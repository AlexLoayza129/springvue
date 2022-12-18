<template>
    <div>
        <navigation-component></navigation-component>
        <section class="center-content">
            <main class="card-login">
                <h2>Login</h2>
                <form action="">
                    <input type="email" v-model="email" class="input-custom" placeholder="Email">
                    <input type="password" v-model="password" class="input-custom" placeholder="Password">
                    <button class="login-btn" @click="login">Ingresa</button>
                </form>
            </main>
        </section>
    </div>
</template>

<script>
import NavigationComponent from '../layouts/NavigationComponent.vue';

export default {
    name: 'Login',
    components: { NavigationComponent },
    data(){
        return {
            url : 'http://localhost:8082/auth/user',
            email: '',
            password: ''
        }
    },  
    methods: {
        login: async function(e){
            e.preventDefault();

            let data = {
                "email": this.email
            }

            $.ajax({
                type: "POST",
                url: this.url,
                data: data,
                dataType: "json",
                success: function (response) {
                    console.log(response.data)
                }
            });
        }
    }
}
</script>

<style scoped>
/* Rappi color: #ff4723 */
.card-login{
    border-top: #ff4723 8px solid;
    box-shadow: 5px 4px 20px 1px rgba(0,0,0,0.5);
    margin: 2rem 0;
    border-radius: 8px;
    padding: 2rem;
    text-align: center;
    max-width: 50vw;
}

.center-content{
    min-width: 50vw !important;
}

form{
    display: flex;
    flex-direction: column;
}

.login-btn{
    width: 100%;
    color: white;
    background-color: #ff4723;
    border-radius: 8px;
    padding: 4px 0;
    margin-top: 1rem;
    transition: all ease-in-out !important;
    transition-duration: 500ms !important;
    transition-delay: 500ms;
}
.login-btn:hover{
    background-color: white;
    border: solid 3px #ff4723;
    color: #ff4723;
}
.input-custom{
    transition: all ease-in-out !important;
    transition-duration: 500ms !important;
    transition-delay: 500ms;
    margin: 0.5rem 0;
}
.input-custom:focus{
    border-bottom: 4px solid #ff4723 ;
    margin: 1rem 0;
}
</style>