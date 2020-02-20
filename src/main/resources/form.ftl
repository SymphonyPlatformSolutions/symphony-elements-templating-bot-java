<form id="${data.id}">
    <h2>${data.title}</h2>
    <#list data.elements as element>
        <#if element.tag=='button'>
            <button name="${element.name}" type="${element.type}">${element.value}</button>
        <#else>
            <${element.tag} name="${element.name}" placeholder="${element.placeholder}">${element.value}</${element.tag}>
        </#if>
    </#list>
</form>
