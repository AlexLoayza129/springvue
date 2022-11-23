import * as VueRouter from './router_base';
import Home from '../components/HomeComponent.vue';

const routes = [
    //Main Routes
    {
        path: "/",
        name: "Home",
        component: Home
    },
    {
        path: "/productos",
        name: "Productos",
        component: () => import("@/components/producto/ProductosComponent.vue")
    },
    {
        path: "/proveedores",
        name: "Proveedores",
        component: () => import("@/components/proveedor/ProveedoresComponent.vue")
    },
    {
        path: "/usuarios",
        name: "Usuarios",
        component: () => import("@/components/usuario/UsuariosComponent.vue")
    },
    // Create "" Routes
    {
        path: "/proveedores/crear",
        name: "ProveedorCrear",
        component: () => import('@/components/proveedor/CrearProveedor.vue')
    },
    {
        path: "/usuarios/crear",
        name: "UsuarioCrear",
        component: () => import('@/components/usuario/CrearUsuario.vue')
    },
    {
        path: "/productos/crear",
        name: "ProductoCrear",
        component: () => import('@/components/producto/CrearProducto.vue')
    },
]

const router = VueRouter.createRouter({
    history: VueRouter.createWebHistory(),
    routes, // long for `routes`
})

export default router;