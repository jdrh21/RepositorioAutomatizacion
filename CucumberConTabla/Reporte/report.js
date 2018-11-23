$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Ejemplo.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: jose_restrepo82131@elpoli.edu.co"
    }
  ],
  "line": 4,
  "name": "Loguearse en Guru99",
  "description": "Quiero iniciar sesion en Guru99",
  "id": "loguearse-en-guru99",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Inicio de sesion exitoso",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Voy a Guru",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Quiero iniciar sesion con el nombre \"\u003cid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "La clave es \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico el resultado \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;",
  "rows": [
    {
      "cells": [
        "id",
        "password",
        "status"
      ],
      "line": 16,
      "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;1"
    },
    {
      "cells": [
        "mngr162502",
        "zurapAs",
        "success"
      ],
      "line": 17,
      "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;2"
    },
    {
      "cells": [
        "mngr162502",
        "werwewe",
        "fail"
      ],
      "line": 18,
      "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;3"
    },
    {
      "cells": [
        "sajjsai",
        "zurapAs",
        "fail"
      ],
      "line": 19,
      "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;4"
    },
    {
      "cells": [
        "sajjsai",
        "werwewe",
        "fail"
      ],
      "line": 20,
      "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Inicio de sesion exitoso",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Voy a Guru",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Quiero iniciar sesion con el nombre \"mngr162502\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "La clave es \"zurapAs\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico el resultado success",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.abro_el_navegador()"
});
formatter.result({
  "duration": 7261662058,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.voy_a_Guru()"
});
formatter.result({
  "duration": 17369714009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr162502",
      "offset": 37
    }
  ],
  "location": "GuruLoginStepsDefinitions.quiero_iniciar_sesion_con_el_nombre(String)"
});
formatter.result({
  "duration": 3200498860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zurapAs",
      "offset": 13
    }
  ],
  "location": "GuruLoginStepsDefinitions.la_clave_es(String)"
});
formatter.result({
  "duration": 3891774740,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.verifico_el_resultado_success()"
});
formatter.result({
  "duration": 5413890220,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Inicio de sesion exitoso",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Voy a Guru",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Quiero iniciar sesion con el nombre \"mngr162502\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "La clave es \"werwewe\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico el resultado fail",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.abro_el_navegador()"
});
formatter.result({
  "duration": 6391364876,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.voy_a_Guru()"
});
formatter.result({
  "duration": 8830005147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr162502",
      "offset": 37
    }
  ],
  "location": "GuruLoginStepsDefinitions.quiero_iniciar_sesion_con_el_nombre(String)"
});
formatter.result({
  "duration": 3163959223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "werwewe",
      "offset": 13
    }
  ],
  "location": "GuruLoginStepsDefinitions.la_clave_es(String)"
});
formatter.result({
  "duration": 3389333868,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.verifico_el_resultado_fail()"
});
formatter.result({
  "duration": 8419874122,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Inicio de sesion exitoso",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Voy a Guru",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Quiero iniciar sesion con el nombre \"sajjsai\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "La clave es \"zurapAs\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico el resultado fail",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.abro_el_navegador()"
});
formatter.result({
  "duration": 6361718734,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.voy_a_Guru()"
});
formatter.result({
  "duration": 6991382849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sajjsai",
      "offset": 37
    }
  ],
  "location": "GuruLoginStepsDefinitions.quiero_iniciar_sesion_con_el_nombre(String)"
});
formatter.result({
  "duration": 3172460080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zurapAs",
      "offset": 13
    }
  ],
  "location": "GuruLoginStepsDefinitions.la_clave_es(String)"
});
formatter.result({
  "duration": 3391776062,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.verifico_el_resultado_fail()"
});
formatter.result({
  "duration": 8430056724,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Inicio de sesion exitoso",
  "description": "",
  "id": "loguearse-en-guru99;inicio-de-sesion-exitoso;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Voy a Guru",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Quiero iniciar sesion con el nombre \"sajjsai\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "La clave es \"werwewe\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verifico el resultado fail",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.abro_el_navegador()"
});
formatter.result({
  "duration": 6313716872,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.voy_a_Guru()"
});
formatter.result({
  "duration": 9467548242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sajjsai",
      "offset": 37
    }
  ],
  "location": "GuruLoginStepsDefinitions.quiero_iniciar_sesion_con_el_nombre(String)"
});
formatter.result({
  "duration": 3189529002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "werwewe",
      "offset": 13
    }
  ],
  "location": "GuruLoginStepsDefinitions.la_clave_es(String)"
});
formatter.result({
  "duration": 3404898886,
  "status": "passed"
});
formatter.match({
  "location": "GuruLoginStepsDefinitions.verifico_el_resultado_fail()"
});
formatter.result({
  "duration": 8417976778,
  "status": "passed"
});
});