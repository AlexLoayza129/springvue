<template>
    <div>
        <header>
            <button @click="toggleMenu" class="menu__item1">
                <img class="boton" src="../../assets/menu.svg" >
            </button>
            <div class="menu__item2">
                <img src="../../assets/rappi.png" width="50">
            </div>
            <div  class="menu__item1">
                <img src="../../assets/rappi_mostacho.png"  height="20">
                <input type="text" placeholder="Buscar en Rappi..."  class= "buscador" size="100px">
                <img  src="../../assets/buscador.svg">
            </div>
            <div class="menu__item1 carrito">
                <img  src="../../assets/carrito.svg" >
            </div>
        </header>
        <nav class="nav">
            <ul class="list" id="list_menu">
                <li class="list__item">
                    <div class="list__icono"> 
                        <img href="index.html" src="../../assets/rappi_mostacho.png"  width="60" class="nav__link">
                        <button @click="toggleMenu" class="boton list__arrow"><img src="../../assets/cerrar.svg" ></button>
                    </div>
                </li>
                <!--Division-->
                <hr size="1px" color="#E0E0E0">
                <!--Division-->
                <li class="list__item">
                    <div class="list__titulo"> 
                        <p class="nav__link">SECCIONES</p>
                    </div>
                </li>
                <li class="list__item seleccion">
                    <button @click="toHome" class="list__button"> 
                        <span class="nav__link">Inicio</span>
                    </button>
                </li>
                <li class="list__item seleccion">
                    <button @click="toProducts" class="list__button"> 
                        <span class="nav__link">Productos</span>
                    </button>
                </li>
                <li class="list__item seleccion">
                    <button @click="toSupliers" class="list__button"> 
                        <span class="nav__link">Proveedores</span>
                    </button>
                </li>
                <li class="list__item seleccion">
                    <button @click="toUsers" class="list__button"> 
                        <span class="nav__link">Usuarios</span>
                    </button>
                </li>
                <!--Division-->
                <hr size="1px" color="#E0E0E0">
                <!--Division-->
                <li class="list__item">
                    <div class="list__titulo"> 
                        <a href="#" class="nav__link">Nuevos Ingresos</a>
                    </div>
                </li>
                <li class="list__item seleccion">
                    <div class="list__button2"> 
                        <button @click="toCreateSuplier" class="nav__link">Registra un proveedor</button>
                    </div>
                </li>
                <li class="list__item seleccion">
                    <div class="list__button2"> 
                        <button @click="toCreateProduct" class="nav__link">Registra un producto</button>
                    </div>
                </li>
                <li class="list__item seleccion">
                    <div class="list__button2"> 
                        <button @click="toCreateUser" class="nav__link">Registra un usuario</button>
                    </div>
                </li>
                <!--Division-->
                <hr size="1px" color="#E0E0E0">
                <!--Division-->
                <li class="list__item seleccion">
                    <div class="list__button"> 
                        <img src="../../assets/peru.png" class="list__peru" width="24">
                        <a href="#" class="nav__link">Perú</a>
                        <!-- <img src="../../../assets/flecha.svg" class="list__arrow"> -->

                    </div>
                </li>
                <!--Division-->
                <hr size="1px" color="#E0E0E0">
            </ul>
        </nav>
    </div>
</template>
<script>
    export default{
        name: 'Home',
        data(){
            return{
                isShowing: false
            }
        },
        methods:{
            toggleMenu(){
                var listMenu = document.getElementById('list_menu');
                this.isShowing = !this.isShowing;

                console.log(listMenu)

                if(this.isShowing){
                    listMenu.style.left = "0"
                }else{
                    listMenu.style.left = "-300px"
                }
            },
            //Main Routes
            toHome(){
                this.$router.push('/')
            },
            toProducts(){
                this.$router.push('/productos')
            },
            toUsers(){
                this.$router.push('/usuarios')
            },
            toSupliers(){
                this.$router.push('/proveedores')
            },
            //Create "" Routes
            toCreateSuplier(){
                this.$router.push('/proveedores/crear')
            },
            toCreateUser(){
                this.$router.push('/usuarios/crear')
            },
            toCreateProduct(){
                this.$router.push('/productos/crear')
            },
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
    background-image: url('../../assets/fondo.webp');
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