<template>
    <div>
        <navigation-component></navigation-component>
        <div class="cuerpo">
            <div class="cuerpo__imagen">
                <img id="imagen" src="" class="comida">
            </div>
            <span class="cuerpo__titulo">¡30 días de</span>
            <br>
            <span class="cuerpo__titulo">entrega gratis!</span>
            <br>
            <span class="cuerpo__subtitulo">Para tus primeros pedidos en Restaurantes.</span>
            <div class="cuerpo__boton">
                <button id="orderNow">¡Pide ahora!</button>
            </div>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from './layouts/NavigationComponent.vue'
    import jQuery from 'jquery'
    window.$ = jQuery

    export default{
        name: 'Home',
        components: {
            NavigationComponent
        }, 
        data(){
            return{
                isShowing: false
            }
        },
        methods:{
            toggleMenu(){
                var listMenu = document.getElementById('list_menu');
                this.isShowing = !this.isShowing;

                if(this.isShowing){
                    listMenu.style.left = "0"
                }else{
                    listMenu.style.left = "-300px"
                }
            },
            toRestaurants(){
                this.$router.push('/restaurantes')
            }
        },
        created(){
            window.$('body', () => {
                let url = "http://localhost:8082/api/usuarios";
                var body = window.$('#usuarios');

                window.$.ajax({
                    type: "GET",
                    url: url,
                    dataType: "json",
                    success: function (response) {
                        response.forEach((element) => {
                            var row = document.createElement('tr');
                            const arrayOfValues = Object.values(element);

                            for(let i = 0; i < arrayOfValues.length; i++){
                                var column = document.createElement('td');
                                column.innerText = arrayOfValues[i]
                                row.append(column);
                            }

                            body.append(row);
                        });
                    }
                });
            })
        },
      
    }
</script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,400;1,300&display=swap');

*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins';
}

.nav{
    width: 250px;
    position: relative;
    z-index: 10;
}

.list{
    width: 300px;
    height: 100vh;
    display: flex;
    flex-direction: column;
    background: #fff;
    position: fixed;
    left: -300px;
    top: 0;
    transition: left .4s;
}


.list__item{
    list-style-type: none;
    width: 100%;
    text-align: center;
}

.list__titulo{
    display: flex;
    align-items: center;
    gap: 1em;
    width: 70%;
    margin: 0 auto;
}

.list__icono{
    display: flex;
    align-items: center;
    gap: 1em;
    width: 90%;
    margin: 0 auto;
}

.list__button{
    display: flex;
    align-items: center;
    gap: 1em;
    width: 80%;
    margin: 0 auto;
}

.seleccion:hover{
    background: #E0E0E0;
}

.list__button2{
    display: flex;
    align-items: center;
    gap: 1em;
    width: 70%;
    margin: 0 auto;
}

.list__arrow{
    margin-left: auto;
}

.nav__link{
    color: #303440;
    display: block;
    padding: 15px 0;
    text-decoration: none;
}

header{
    margin: 0 auto;
    padding: 0 10px 0 10px;
    width: 100%;
    height: 61px;
    border-bottom: 1px solid #E0E0E0;
    display: grid; 
    gap: 20px;
    grid-template-columns: 2.5% 6% auto 2.5%;
}
button{
    border: none;
    background: transparent;
    cursor: pointer;
}

.menu__item1{
    display: flex;
    align-self: center;
    justify-self: center;
}

.menu__item2{
    align-self: center;
    border-right: 1px solid #E0E0E0;
}

.carrito{
    border-left: 1px solid #E0E0E0;
}
.carrito > img{
    margin-left: 10px;
}

.buscador{
    border: 0;
    margin-left: 10px;
    margin-right: 10px;
    outline: none;
    font-size: 15px;
}

.cuerpo{
    padding-left: 50px;
    height: 600px;
    background-image: url('../assets/fondo.webp');
    background-repeat: no-repeat;
    background-position: right bottom;
}

.cuerpo__imagen{
    width: 100%;
    height: 200px;
}

.comida{
    scale: 0.5;
    transition: .60s;
}

.cuerpo__titulo{
    font-size: 60px;
    font-weight: bold;
}

.cuerpo__subtitulo{
    font-size: 19px;
}

.cuerpo__boton{
    height: 150px;
    margin: 0 auto;
    display: flex;
    align-items: center;
    align-self: center;
}

.cuerpo__boton > button{
    width: 300px;
    height: 50px;
    border-radius: 0.25cm;
    background-color: black;
    color: white;
    font-size: 15px;
    font-weight: bold;
}

</style>