<template>
    <div>
        <navigation-component></navigation-component>
        <div class="table-box">
            <table class="user-table">
                <thead>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Correo</th>
                    <th>Password</th>
                    <th>Telefono</th>
                    <th>Direccion</th>
                    <th>RolId</th>
                </thead>
                <tbody id="usuarios">
                </tbody>
            </table>
        </div>
    </div>
</template>
<script>
    import NavigationComponent from '@/components/layouts/NavigationComponent.vue';

    export default {
        name: 'UsuariosComponent',
        components: { NavigationComponent },
        methods: {
            getUsers: function (){
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
            }
        },
        created(){
            this.getUsers(); //Getting all users
        }
    }
</script>
<style>

table {
	border-collapse: collapse;
    font-family: Tahoma, Geneva, sans-serif;
}
table td {
	padding: 15px;
}
table thead td {
	background-color: #54585d;
	color: #ffffff;
	font-weight: bold;
	font-size: 13px;
	border: 1px solid #54585d;
}
table tbody td {
	color: #636363;
	border: 1px solid #dddfe1;
}
table tbody tr {
	background-color: #f9fafb;
}
table tbody tr:nth-child(odd) {
	background-color: #ffffff;
}

.table-box{
    margin-top: 2rem;
    display: flex;
    justify-content: center;
    align-items: center;
}

.user-table > thead > th{
    background-color: #54585d;
    color: white;
    padding: 4px;
}

@media (max-width: 768px) {
    .user-table{
        max-width: 50vw;
        font-size: 12px !important;
    }
}
</style>