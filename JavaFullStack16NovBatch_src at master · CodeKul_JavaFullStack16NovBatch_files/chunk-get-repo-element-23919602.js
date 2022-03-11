System.register(["./chunk-vendor.js","./chunk-frameworks.js"],function(h){"use strict";var a,f,u,m,g;return{setters:[function(s){a=s.t,f=s.b,u=s.c},function(s){m=s.s,g=s.aB}],execute:function(){var s=Object.defineProperty,C=Object.getOwnPropertyDescriptor,L=(t,e)=>s(t,"name",{value:e,configurable:!0}),r=(t,e,c,i)=>{for(var n=i>1?void 0:i?C(e,c):e,l=t.length-1,p;l>=0;l--)(p=t[l])&&(n=(i?p(e,c,n):p(n))||n);return i&&n&&s(e,c,n),n};const{getItem:P,setItem:b}=m("localStorage"),d="code-button-default-tab";let o=h("G",class extends HTMLElement{constructor(){super(...arguments);this.shouldRefreshList=!1}showDownloadMessage(t){const e=this.findPlatform(t);!e||this.showPlatform(e)}showCodespaces(t){const e=this.findPlatform(t);!e||(this.showPlatform(e),this.loadAndUpdateContent())}showCodespaceSelector(t){const e=this.findPlatform(t);!e||(this.showPlatform(e),this.codespaceSelector&&(this.codespaceSelector.hidden=!1))}showOpenOrCreateInCodespace(){this.openOrCreateInCodespace&&(this.openOrCreateInCodespace.hidden=!1)}removeOpenOrCreateInCodespace(){this.openOrCreateInCodespace&&this.openOrCreateInCodespace.remove()}refreshList(){this.shouldRefreshList&&(this.shouldRefreshList=!1,this.loadAndUpdateContent())}trackDelete(){this.shouldRefreshList=!0}hideSpinner(){this.codespaceLoadingMenu&&(this.codespaceLoadingMenu.hidden=!0),this.codespaceList&&(this.codespaceList.hidden=!1)}showSpinner(){this.codespaceLoadingMenu&&(this.codespaceLoadingMenu.hidden=!1),this.codespaceList&&(this.codespaceList.hidden=!0)}onDetailsToggle(t){this.modal.hidden=!1;for(const c of this.platforms)c.hidden=!0;const e=t.target;e&&e.open&&this.selectDefaultTab()}showPlatform(t){this.modal.hidden=!0;for(const e of this.platforms)e.hidden=e.getAttribute("data-platform")!==t}findPlatform(t){return t.currentTarget.getAttribute("data-open-app")||g()}refreshOnError(){window.location.reload()}pollForVscode(t){this.showPlatform("vscode");const e=t.currentTarget.getAttribute("data-src");e&&this.vscodePoller.setAttribute("src",e)}backToCodespacesFromVscodePolling(){this.loadAndUpdateContent(),this.showPlatform("codespaces")}localTabSelected(){b(d,"local")}cloudTabSelected(){b(d,"cloud")}selectDefaultTab(){const t=P(d);if(!t)return;const e=this.querySelector(`button[data-tab="${t}"`);e&&e.click()}loadAndUpdateContent(){this.codespaceList.setAttribute("src",this.codespaceList.getAttribute("data-src"))}});L(o,"GetRepoElement"),r([a],o.prototype,"modal",2),r([a],o.prototype,"codespaceForm",2),r([a],o.prototype,"codespaceLoadingMenu",2),r([a],o.prototype,"codespaceList",2),r([a],o.prototype,"codespaceSelector",2),r([a],o.prototype,"openOrCreateInCodespace",2),r([a],o.prototype,"vscodePoller",2),r([f],o.prototype,"platforms",2),o=h("G",r([u],o))}}});
//# sourceMappingURL=chunk-get-repo-element-b216c121.js.map
