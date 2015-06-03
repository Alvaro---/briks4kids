<h2>Inscripcion nuevo niño:</h2>

<p>Conplete los siguientes datos: </p>

<div class="registroNino">
    <form action="GuardarNino" method="get">
        
        <div class="cajaRegNino1">
            <p id="subtitulo">Datos del Niño </p>
            <p> <label for="nombre">Nombres:</label> <input type="text" name="nombres" placeholder="Nombres" required> </p>
            <p> <label for="apPaterno">Apellido Paterno</label> <input type="text" name="apPaternos" placeholder="Paterno" required> </p>
            <p> <label for="apMaterno">Apellido Materno</label> <input type="text" name="apMaternos" placeholder="Materno" required> </p>
            <p> <label for="fechaNacimiento">Fecha de Nacimiento</label> <input type="date" name="nacimiento"> 
            <p> <label for="Nota">Nota:</label> <textarea>Recomendaciones....</textarea>
        </div> 

        <div class="cajaRegNino1">
            <p id="subtitulo">Datos de Referencia </p>
            <p><label for="NombrePapa">Nombre papá</label> <input type="text" name="NombrePapa" placeholder="Papa" > </p>
            <p><label for="NombreMama">Nombre mamá</label> <input type="text" name="NombreMama" placeholder="Mama" > </p>
            <p><label for="TelefonoRef">Telefono de referencia</label> <input type="number" name="TelefonoRef" placeholder="27..."pattern="^0[1-689][0-9]{8}$"> </p>
            <p><label for="celRef">Celular de referencia - Papá</label> <input type="number" name="celRef" placeholder="77..." pattern="^0[1-689][0-9]{8}$"> </p>
            <p><label for="celRefm">Celular de referencia - Mamá</label> <input type="number" name="celRefm" placeholder="77..." pattern="^0[1-689][0-9]{8}$"> </p>
            <p><label for="correoPapa">Correo Electronico Papá</label> <input type="email" name="correoPapa" placeholder="@"> </p>
            <p><label for="correoMama">Correo Electronico Mamá</label> <input type="email" name="correoMama" placeholder="@"> </p>
        </div>
        <div class="cajaRegNino2">
            <input type="submit" value="Guardar" id="guardarNino">
        </div>
    </form>
</div>